(defproject anemia "0.1.0-SNAPSHOT"
  :description "asynchronous schema mygrations"
  :url "https://github.com/it0a/anemia"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main anemia.core
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jdbc "0.3.7"]
                 [mysql/mysql-connector-java "5.1.6"]])
