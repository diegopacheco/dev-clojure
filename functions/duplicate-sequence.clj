;(defn duplicate[s]
; (if (keyword? (s 0))
;   (sort-by (hash-set (last s)) (clojure.set/union s s))        
;   (sort <
;      (clojure.set/union s s)
;   )
; )
;)
(defn duplicate[s]
  (reverse (
    (fn [s c]
	  (if (empty? s)
		c
		(recur (drop-last s) (conj (conj c (last s)) (last s)))
      )
    ) (reverse s) ()
  ))
)


(prn (duplicate [1 2 3]))
	
(prn (duplicate [:a :a :b :b]))
	
(prn (duplicate [[1 2] [3 4]]))
	
(prn (duplicate [[1 2] [3 4]]))