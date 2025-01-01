(ns asteroids.core
  (:gen-class)
  (:require [quip.core :as qp]
            [asteroids.scenes.level-01 :as level-01]
            [asteroids.scenes.menu :as menu]))

(defn setup
  "The initial state of the game"
  []
  {})

(defn init-scenes
  "Map of scenes in the game"
  []
  {:menu     (menu/init)
   :level-01 (level-01/init)})

;; Configure the game
(def asteroids-game
  (qp/game {:title          "asteroids"
            :size           [1920 1080]
            :setup          setup
            :init-scenes-fn init-scenes
            :current-scene  :menu}))

(defn -main
  "Run the game"
  [& args]
  (qp/start! asteroids-game))
