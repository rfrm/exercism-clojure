(ns word-count
  (:require [clojure.string :as s]))

(defn word-count [message]
  (-> message
      s/lower-case  
      (s/split #"\W+")
      frequencies))

(defn say_hello []
  "Hello, world")
