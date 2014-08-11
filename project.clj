(defproject om-sync "0.1.2-SNAPSHOT"
  :description "A sync component for Om"
  :url "http://github.com/swannodette/om-sync"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311" :scope "provided"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha" :scope "provided"]
                 [om "0.7.1" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ancient "0.5.5"]]

  :cljsbuild { 
    :builds [{:id "test"
              :source-paths ["src"]
              :compiler {
                :output-to "app.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
