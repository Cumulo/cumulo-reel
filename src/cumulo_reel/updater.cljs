
(ns cumulo-reel.updater
  (:require [cumulo-reel.updater.session :as session]
            [cumulo-reel.updater.user :as user]
            [cumulo-reel.updater.router :as router]
            [cumulo-reel.schema :as schema]
            [respo-message.updater :refer [update-messages]]))

(defn updater [db op op-data sid op-id op-time]
  (let [f (case op
            :session/connect session/connect
            :session/disconnect session/disconnect
            :session/remove-message session/remove-message
            :user/log-in user/log-in
            :user/sign-up user/sign-up
            :user/log-out user/log-out
            :router/change router/change
            (do (println "Unknown op:" op) identity))]
    (f db op-data sid op-id op-time)))
