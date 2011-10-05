;;
;; compile-clj.bat user.complex
;;
(ns user.complex (:gen-class))

(gen-class :name user.Person :state state :init init :constructors {[String,Integer] []} )
(defstruct Person :name :age)
(defn -init [s,i] [[] {:name s :age i}])

(gen-class :name user.PrintPerson :prefix "print-" :methods [[person [user.Person] void]] )
(defn print-person [this p] (prn (str  ((.state p) :name) " - " ((.state p) :age) )) )
