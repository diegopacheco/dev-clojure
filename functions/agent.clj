;;
;; Create a agent
;;
(def a (agent 10))

;;
;; inspect/retrieve
;;
(prn (deref a))
(prn @a)

;;
;; Change state Async
;;
(send a inc)
(prn @a)

;;
;; Change state Sync
;;
(send-off a #(+ 19 %))
(prn @a)

;;
;; Register a watcher
;;
(add-watch a :logger 
   (fn logger[key a oldv newv] 
	   (prn (str "[Agent Log] Key: " key " Agent: " a " old-value: " oldv " new-value: " newv))			
   )
)
(send-off a (fn [a] 500))
(prn @a)

;;
;; Shutdown Agent
;;
(shutdown-agents)