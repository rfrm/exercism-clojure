(ns beer-song)

(defn bottles [n] 
  (cond
    (< 1 n) (str n " bottles")
    (= 1 n) "1 bottle"
    :else "no more bottles"))

(defn say-bottles [n]
  (let [bottles (bottles n)]
    (if (< 0 n)
      (str bottles " of beer on the wall, " bottles " of beer.\n")
      "No more bottles of beer on the wall, no more bottles of beer.\n")))

(defn say-action [n]
  (let [remaining-bottles (dec n)
        det (if (= n 1) "it" "one")]
    (if (< 0 n)
      (str "Take " det " down and pass it around, " (bottles remaining-bottles) " of beer on the wall.\n")
      "Go to the store and buy some more, 99 bottles of beer on the wall.\n")))

(defn verse [n]
  (str (say-bottles n) (say-action n))
)

(defn sing 
  ([a] (sing a 0))
  ([a b] 
   (->> (range a (dec b) -1)
        (map verse)
        (clojure.string/join "\n"))))
