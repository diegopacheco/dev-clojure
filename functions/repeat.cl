;;
;; repeat
;; function
;;   Usage: (repeat x)
;;      (repeat n x)
;;      Returns a lazy (infinite!, or length n if supplied) sequence of xs.
;;
;; Added in Clojure version 1.0
;;
(prn (repeat 3 10))

(prn (take 10 (repeat 3)))

(prn (repeat 2 (rand-int 100)))