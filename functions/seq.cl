;; seq
;; function
;;   Usage: (seq coll)
;;	 Returns a seq on the collection. If the collection is
;;	 empty, returns nil.  (seq nil) returns nil. seq also works on
;;	 Strings, native Java arrays (of reference types) and any objects
;;	 that implement Iterable.
;;
;; Added in Clojure version 1.0
;;
;; Persistent & Immutable, thread safe, share-structures, many-algorithms(ISeq - Logical List)
;;
(def s (seq '(1 2 3)))
(prn s)

(def v (seq [1 2 3]))
(prn v)

(def m (seq {1 "Diego" 2 "Pacheco"}))
(prn m)

(def h (seq #{"Diego" "Pacheco"}))
(prn h)

(prn (first s))
(prn (first v))
(prn (first m))
(prn (first h))