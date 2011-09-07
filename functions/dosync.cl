;;
;; dosync
;; macro
;;
;; Usage: (dosync & exprs)
;; Runs the exprs (in an implicit do) in a transaction that encompasses
;; exprs and any nested calls.  Starts a transaction if none is already
;; running on this thread. Any uncaught exception will abort the
;; transaction and flow out of dosync. The exprs may be run more than
;; once, but any effects on Refs will be atomic.
;;
;; Added in Clojure version 1.0
;;
(def r (ref 0))
(prn r)

;; (alter r inc) ;; IllegalStateException: No transaction running
(dosync (alter r inc))
(dosync (alter r inc))
(prn r)

(def q (ref {:name "Diego" :age 26}))
(prn q)
(dosync (alter q :name "Pacheco"))
(prn q)

(prn (deref r))
(prn (deref q))

