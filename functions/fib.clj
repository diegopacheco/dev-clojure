(defn fib[n]
  ( (fn [n i c]
	  (if (zero? n) c
		(recur (dec n) (inc i) (conj c (+ (last c) (first (rest (reverse c))))))
	  )
	) (- n 2) 0 [1 1]
  )
)	

(prn (fib 3))
(prn (fib 6))