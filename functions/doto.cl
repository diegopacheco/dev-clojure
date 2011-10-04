;;
;; doto
;;
(prn (doto (java.util.HashMap.) (.put "a" 1) (.put "b" 2)))   ;; #<HashMap {b=2, a=1}>

(prn (doto (java.util.ArrayList.) (.add 4) (.add "Test") ) )  ;; #<ArrayList [4, Test]>

