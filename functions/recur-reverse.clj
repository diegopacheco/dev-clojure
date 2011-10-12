(defn revs [c]
    (
	  (fn [r c] 
		  (if (empty? c)
			 r
			 (recur (conj r (last c)) (drop-last c) )
		  )
	  ) [] c	  
	)
)

(prn (revs [1 2 3 4]))
(prn (revs [1 2 3 3 4 5 6 7 8 9]))
(prn (revs '(6 7)))