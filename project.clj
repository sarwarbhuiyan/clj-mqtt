(defproject clj-mqtt "0.3.3-alpha"

  :description "Clojure MQTT Codec for Netty"

  :url "http://github.com/xively/clj-mqtt"

  :dependencies [[io.netty/netty-all "4.0.4.Final"]]

  ;; Defaults
  :source-paths ["src"]
  :test-paths ["test"]

  :profiles {
    :dev {:dependencies [[org.clojure/clojure "1.5.1"]
                         [org.eclipse.paho/mqtt-client "0.2.1"]]
          :global-vars {*warn-on-reflection* true}}

    :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]
                         [org.eclipse.paho/mqtt-client "0.2.1"]]}

    :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]
                         [org.eclipse.paho/mqtt-client "0.2.1"]]}

    :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]
                         [org.eclipse.paho/mqtt-client "0.2.1"]]}

    :1.6 {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]
                         [org.eclipse.paho/mqtt-client "0.2.1"]]}
  }

  :aliases {"all" ["with-profile" "dev:1.3,dev:1.4,dev:1.5,dev:1.6,dev"]}

  :repositories {"springsource" {:url "http://repo.springsource.org/libs-milestone/"
                                 :snapshots true
                                 :releases {:checksum :fail :update :always}}}

  :license {:name "BSD 3-Clause License"
            :distribution :repo})
