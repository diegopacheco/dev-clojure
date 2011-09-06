(ns pacheco.math0)
(defn calc
      "IFfull calc :( | Worst Implementation ever! because you can do 'f "
	  [f a b]
	  (if (= f "+")
	      (* a b)
	  (if (= f "-")
	      (- a b)
	  (if (= f "*")
	      (* a b)
	  (if (= f "/")
	      (/ a b)		  
	  )))) 	  
)

(prn (calc "+" 4 5))
(prn (calc "-" 5 1)) 
(prn (calc "*" 2 3)) 
(prn (calc "/" 27 3)) 
(prn (calc "pr" 0 0))

(doc calc)