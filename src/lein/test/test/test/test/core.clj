(ns test.test.core
  (:use [test.core])
  (:use [clojure.test]))

(deftest fpsoma
  (is (= (soma 5 5) 10))
)

