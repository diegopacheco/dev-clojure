;;
;; assoc
;; function
;;
;; Usage: (assoc map key val)
;;        (assoc map key val & kvs)
;; assoc[iate]. When applied to a map, returns a new map of the
;; same (hashed/sorted) type, that contains the mapping of key(s) to
;; val(s). When applied to a vector, returns a new vector that
;; contains val at index. Note - index must be <= (count vector).
;;
;; Added in Clojure version 1.0
;;
(def m {:name "Diego" :age 26 :lang "Clojure" })
(prn m)
(def m (assoc m :role "Architect/Coach"))
(prn m)
(def m (assoc m :name "Diego Pacheco"))
(prn m)

(def v ["Diego" 26 "Clojure"] )
(prn v)
(def w (assoc m :vec v))
(prn w)

