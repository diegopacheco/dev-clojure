(defn rep[s n]
  (let [r ((fn [q s n]
    (for [i s] 
      (conj q (repeat n i)))) [] s n)
   ] (if (vector? (s 0))
         (concat (first (first r)) (last (last r)))
         (flatten r) 		 
   ))
)

(prn (rep [1 2 3] 2))

(prn (rep [44 33] 2))

(prn (rep [[1 2] [3 4]] 2))