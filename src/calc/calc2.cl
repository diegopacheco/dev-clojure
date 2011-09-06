(ns pacheco.math2)
(defn calc
      "make simple math like +, -, /, * based on 2 attributes in this func there is a operator validation"
	  [f a b]
	  (if (contains? {+ 0 - 0 * 0 / 0} f) 
	      (f a b) 
		  (throw (RuntimeException. (str "Invalid Operator " f)))
	  )
)

(prn (calc + 4 5))
(prn (calc - 5 1)) 
(prn (calc * 2 3)) 
(prn (calc / 27 3)) 

(try
    (prn (calc "F" 8 8)) 
(catch RuntimeException e
    (println "Exception")
))

(doc calc)