;;
;; classname. & new 
;;
(prn (java.lang.String. "Test String Java"))              ;; "Test String Java"
(prn (new java.lang.String "Test String Java 2"))         ;; "Test String Java 2"

(prn (java.lang.Double. "224.33"))                        ;; 224.33
(prn (new java.lang.Double "5000.4"))                     ;; 5000.4

(doto 
	(javax.swing.JFrame. "My Frame") 	
	(.setBounds 300 300 600 400)
	(.setVisible true) 
	(.add (javax.swing.JLabel. "Clojure Rocks")) 
)
;; 
;; #<JFrame javax.swing.JFrame[frame6,300,300,600x400,invalid,layout=java.awt.BorderLayout,title=My Frame,resizable,
;;   normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,30,584x362,invalid,
;;   layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=, 
;;   minimumSize=,preferredSize=],rootPaneCheckingEnabled=true
;; ]>
;;



