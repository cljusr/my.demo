(ns my.demo)
  (:require [jepsen.cli :as cli]
            [jepsen.tests :as tests])

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!" args))
