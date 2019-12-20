(defproject hsbc_code_test2 "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns hsbc-code-test2.core}
  :java-source-paths ["src/java"]
  :main hsbc-code-test2.core
  :aot [hsbc-code-test2.core]
  )


