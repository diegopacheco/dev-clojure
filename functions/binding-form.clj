(defn fmax
 ([a b c d ] (first (sort > (list a b c d))))
 ([a b] (first (sort > (list a b))))
 ([a b c] (first (sort > (list a b c))))
)

(prn (fmax 1 8 3 4)) ;; 8

(prn (fmax 30 20)) ;; 30

(prn (fmax 45 67 11)) ;; 67