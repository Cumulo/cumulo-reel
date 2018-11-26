
(ns cumulo-reel.node-config (:require ["path" :as path] [cumulo-reel.config :as config]))

(def dev? (do ^boolean js/goog.DEBUG))

(def env {:storage-path (path/join js/__dirname "storage.edn")})
