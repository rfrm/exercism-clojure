(ns rna-transcription)

(def complementary {\C \G \G \C \A \U \T \A})

(defn to-rna [bases]
  (assert (every? complementary bases))
  (apply str (map complementary bases))
)
