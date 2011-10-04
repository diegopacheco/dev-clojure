;;
;; Macro ..
;;
(prn (.. System (getProperties) (get "os.name")))     ;; "Windows 7"
(prn (. (. System (getProperties)) (get "os.name")))  ;; "Windows 7"

(prn (.. java.lang.Math (random) (toString) )   )  ;; 0.46711787570503716
(prn (. (. java.lang.Math (random)) (toString) ))  ;; 0.46711787570503716


(prn (. 
	  java.lang.Math 
	  (random)
	 ) 
)

;; 0.5160818988031174