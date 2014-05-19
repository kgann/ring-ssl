(defproject ring/ring-ssl "0.2.0-SNAPSHOT"
  :description "Middleware for securing handlers over HTTPS"
  :url "https://github.com/ring-clojure/ring-ssl"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ring/ring-core "1.3.0-RC1"]]
  :plugins [[codox "0.8.5"]]
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}})
