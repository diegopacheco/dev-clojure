(ns pacheco.cartaxes)

(defstruct car :owner-name :car-type :cur-speed :license-plate)
(def fusca (struct car "John" "Fiat-Fusca" 110 "SCLJ123"))
(def astra (struct car "Paul" "Chev-Astra" 290 "PCLJ661"))
(def d20   (struct car "Philip" "Chev-D20" 90  "LCLJ254"))

(prn fusca)
(prn astra)
(prn d20)

(defn car-tax [c]
	  (if (<= (:cur-speed c) 99) 
	      (apply merge c (assoc c :tax 0))
        (if (= (:cur-speed c) 100)
           (apply merge c (assoc c :tax 10))
           (apply merge c (assoc c :tax (+ (* (- (:cur-speed c) 100) 20) 10)) )  		  
      )))	  
(defn car-taxes [v] 
      (map car-tax v)
)

(def cars [fusca astra d20])
(prn "Applying taxes")

(prn cars)
(def fusca (car-tax fusca))
(def astra (car-tax astra))
(def d20   (car-tax d20))
(def cars  (car-taxes cars))
 
(prn fusca)
(prn astra)
(prn d20)
(prn cars)

;;
;; Unit testing
;;
(use 'clojure.test)

(deftest taxes
  (is (= (do (car-tax fusca) 210) (:tax fusca)))  
  (is (= (do (car-tax astra) 3810) (:tax astra)))  
  (is (= (do (car-tax d20) 0) (:tax d20)))  
)

(deftest cars-vector
  (is (not= (do (car-taxes cars) cars) nil))    
)

(run-tests 'pacheco.cartaxes)