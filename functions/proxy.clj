(def p 
 (proxy 
	[java.util.concurrent.Callable] 
	[] 
	(call [] 1000)
 )
)

(prn p)
(prn (. p call))

