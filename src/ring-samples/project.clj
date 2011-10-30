(defproject ring "1.0.0-RC1"
  :description "Ring Sample Test"
  :url "https://github.com/diegopacheco/dev-clojure"
  :dependencies
    [[ring/ring-core "1.0.0-RC1"]
     [ring/ring-devel "1.0.0-RC1"]
     [ring/ring-jetty-adapter "1.0.0-RC1"]
     [ring/ring-servlet "1.0.0-RC1"]]
  :dev-dependencies
    [[org.clojars.weavejester/autodoc "0.9.0"]]
  :autodoc
    {:name "Ring Sample Test"
     :description "Ring is a Clojure web applications library, this is a test."})
