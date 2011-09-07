;;
;; subs
;; function
;;
;; Usage: (subs s start)
;;        (subs s start end)
;; Returns the substring of s beginning at start inclusive, and ending
;; at end (defaults to length of string), exclusive.
;;
;;Added in Clojure version 1.0
;;
(def s "Diego Pacheco's String")
(prn s)

(def r (subs s 0 5))
(prn r)

(def r (subs s 20))
(prn r)

