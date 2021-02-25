
(ns cumulo-reel.twig.user (:require ))

(defn twig-user [user] (dissoc user :password))
