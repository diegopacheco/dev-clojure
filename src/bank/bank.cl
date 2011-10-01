(ns pacheco.bank)

;;
;; Structures
;;
(defstruct bank-account :name :value)
(def a1 (ref (struct bank-account "Diego" 500)))
(def a2 (ref (struct bank-account "Petter" 100)))

;;
;; Functions
;;
(defn bank-op [acc v f] 
	(dosync 
		(ref 
		  (apply merge (deref acc) 
				(assoc {} :value 
				    (f (:value (deref acc)) v)
				) 
		  )
		)
	)
)
(defn bank-deposit  [acc v] (bank-op acc v +) )
(defn bank-withdraw [acc v] (bank-op acc v -) )
(defn bank-assessment [acc] (str (str ((deref acc) :name) " have ") (:value (deref acc)) ))
 
;;
;; Usage
;;
(prn a1)
(prn a2)

(prn (bank-deposit a1 10))
(prn (bank-deposit a2 200))

(prn a1)
(prn a2)

(prn (bank-assessment a1))
(prn (bank-assessment a2))

(prn (bank-withdraw a1 50))
(prn (bank-withdraw a2 10))

(prn a1)
(prn a2)

;;
;; Unit testing
;;
(use 'clojure.test)

(deftest deposit
  (is (= (:value (deref (bank-deposit a1 10))) 510) )   
  (is (= (:value (deref (bank-deposit a2 200))) 300) )   
)
(deftest withdraw
  (is (= (:value (deref (bank-withdraw a1 10))) 490) )   
  (is (= (:value (deref (bank-withdraw a2 90))) 10) )   
)
(deftest assessment
  (is (= "Diego have 500" (bank-assessment a1)))
  (is (= "Petter have 100" (bank-assessment a2)))
)

(run-tests 'pacheco.bank)