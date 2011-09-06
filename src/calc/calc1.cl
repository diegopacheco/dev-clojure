(ns pacheco.math)
(defn calc "Simple Math" [f a b] (f a b) )

(prn (calc + 4 5))
(prn (calc - 5 1)) 
(prn (calc * 2 3)) 
(prn (calc / 27 3)) 

(doc calc)