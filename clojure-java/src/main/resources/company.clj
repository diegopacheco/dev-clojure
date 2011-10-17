(ns user)

(def employees (ref [])) 

(defstruct employee :name :age :role :salary)

(defn hire[e]
      (dosync (alter employees conj e))
)

(defn print-employee[e]
      (prn (str "Name: " (:name e) " - Age: " (:age e) 
                " - Role: " (:role e) " - Salary:" (:salary e)
            )
      )
)

(defn print-employees[]
      (for [i (range (count @employees))]
           (print-employee (employees i))
      )
)

