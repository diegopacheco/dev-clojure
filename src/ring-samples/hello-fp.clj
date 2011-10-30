(ns diego.pacheco.lt.ring 
  (:use ring.adapter.jetty)
  (:import java.util.Date java.text.SimpleDateFormat))

(defn app
  [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str "<h3>Hello World from Ring FP</h3>"
                 "<p>The current time in Clojure-Land is: <b>"
                 (.format (SimpleDateFormat. "HH:mm:ss") (Date.))
                 "</b>.</p>")})

(run-jetty app {:port 8080})

