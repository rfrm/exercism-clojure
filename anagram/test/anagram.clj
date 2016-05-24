(ns anagram
  (:require [clojure.string :as s]))

(defn base-permutation [word]
  (apply str (-> word
                 s/lower-case
                 sort)))

(defn is-anagram? [word, candidate]
  (and (not (.equalsIgnoreCase word candidate))
       (= (base-permutation word)
          (base-permutation candidate))))

(defn anagrams-for [word, candidates]
  (filter (partial is-anagram? word) candidates))
