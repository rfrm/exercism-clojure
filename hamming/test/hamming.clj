(ns hamming)

(defn distance [s1 s2]
  (if (= (count s1) (count s2))
    (->> (map vector s1 s2)
         (filter (fn [pair] (not= (first pair) (last pair))))
         count)))
