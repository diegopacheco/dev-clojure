(def p1 (get-proxy-class java.io.Serializable))

(prn p1)

(def p2 (get-proxy-class java.util.ArrayList java.io.Serializable java.util.concurrent.Callable))

(prn p2)

