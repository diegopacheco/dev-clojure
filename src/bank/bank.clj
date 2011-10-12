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
		(alter acc assoc :value (f (:value @acc) v))
	)	
)
(defn bank-deposit  [acc v] (bank-op acc v +) )
(defn bank-withdraw [acc v] (bank-op acc v -) )
(defn bank-assessment [acc] (str (str ((deref acc) :name) " have ") (:value @acc) ))
(defn bank-transfer [acc1 acc2 v] (do  (bank-withdraw acc1 v) (bank-deposit acc2 v) true))
 
;;
;; Usage
;;
(prn a1)
(prn a2)

(prn (bank-deposit a1 100))
(prn (bank-deposit a2 200))

(prn a1)
(prn a2)

(prn (bank-assessment a1))
(prn (bank-assessment a2))

(prn (bank-withdraw a1 100))
(prn (bank-withdraw a2 200))

(prn (bank-assessment a1))
(prn (bank-assessment a2))

(prn a1)
(prn a2)

(prn (bank-transfer a1 a2 100))

(prn a1)
(prn a2)

;;
;; Unit testing
;;
(use 'clojure.test)

(deftest deposit
  (is (= ((bank-deposit a1 10)  :value) (@a1 :value)) 500)   
  (is (= ((bank-deposit a2 200) :value) (@a2 :value)) 210)   
)
(deftest withdraw
  (is (= ((bank-withdraw a1 10) :value) (@a1 :value)) 500)   
  (is (= ((bank-withdraw a2 90) :value) (@a2 :value)) 100)
)
(deftest assessment
  (is (= "Diego have 400" (bank-assessment a1)))
  (is (= "Petter have 200" (bank-assessment a2)))
)
(deftest transfer
  (is (= (do (bank-transfer a1 a2 100) 
             (= (bank-assessment a1) "Diego have 300" ) 
             (= (bank-assessment a2) "Petter have 300")
         )
      )
  )
)

(run-tests 'pacheco.bank)