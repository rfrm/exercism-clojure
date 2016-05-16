(ns bob
  (:require [clojure.string :as s]))

(defn shout?
  [msg] 
  (re-matches #"^(?=.*[A-Z])[^a-z]+$" msg))

(defn response-for 
  [msg]
  (cond 
    (s/blank? msg) "Fine. Be that way!"
    (shout? msg) "Whoa, chill out!"
    (s/ends-with? msg "?") "Sure."
    :else "Whatever."))
