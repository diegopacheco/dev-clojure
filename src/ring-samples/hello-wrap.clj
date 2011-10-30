(ns diego.pacheco.lt.ring (:use ring.handler.dump
        ring.middleware.stacktrace
        ring.middleware.file-info
        ring.middleware.file
        ring.adapter.jetty))

(defn wrap-error [app]
  (fn [req]
    (if (= "/error" (:uri req))
      (throw (Exception. "Demonstrating ring.middleware.stacktrace"))
      (app req))))

(def app
  (-> handle-dump
    wrap-error
    (wrap-file "public")
    wrap-file-info
    wrap-stacktrace))

(run-jetty app {:port 8080})

