;; lazy-seq
;; macro
;;   Usage: (lazy-seq & body)
;;     Takes a body of expressions that returns an ISeq or nil, and yields
;;     a Seqable object that will invoke the body only the first time seq
;;     is called, and will cache the result and return it on all subsequent
;;     seq calls.
;;
;; Persistent & Immutable, thread safe, share-structures, many-algorithms(ISeq - Logical List) 
;; AND is lazy !!! 
;;
;; Added in Clojure version 1.0
;;
(def s (lazy-seq '(1 2 3)))
(prn s)

(def v (lazy-seq [1 2 3]))
(prn v)

(def m (lazy-seq{1 "Diego" 2 "Pacheco"}))
(prn m)

(def h (lazy-seq #{"Diego" "Pacheco"}))
(prn h)

(prn (first s))
(prn (first v))
(prn (first m))
(prn (first h))