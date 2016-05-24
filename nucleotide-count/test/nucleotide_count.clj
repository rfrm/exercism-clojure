(ns nucleotide-count)

(def valid-nucleotides #{\A \G \C \T})

(defn nucleotide-counts [dna_string]
  (merge {\A 0 \G 0 \C 0 \T 0} (frequencies dna_string )))

(defn count [nucleotide dna]
  (assert (valid-nucleotides nucleotide))
  ((nucleotide-counts dna) nucleotide))
