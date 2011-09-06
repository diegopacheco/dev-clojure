(ns pacheco.math3)
(defn calc
      "Ultra Calc :-)"
	  [f a b]
	  (if (disj #{+ - * /} f) (f a b) -1)
)

(prn (calc + 4 5))
(prn (calc - 5 1)) 
(prn (calc * 2 3)) 
(prn (calc / 27 3)) 
(prn (calc 'pr 0 0))

(doc calc)