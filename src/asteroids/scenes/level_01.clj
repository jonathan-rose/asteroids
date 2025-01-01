(ns asteroids.scenes.level-01
  (:require [quip.sprite :as sprite]
            [quip.util :as u]
            [quil.core :as q]
            [asteroids.common :as c]
            [asteroids.sprites.rock :as rock]))

(defn sprites
  "The initial list of sprites for this scene"
  []
  [(rock/rock [50 50])])

(defn draw-level-01!
  "Called each frame, draws the current scene to the screen"
  [state]
  (u/background c/black)
  (sprite/draw-scene-sprites! state))

(defn update-level-01
  "Called each frame, update the sprites in the current scene"
  [state]
  (-> state
      sprite/update-state))

(defn init
  "Initialise this scene"
  []
  {:sprites   (sprites)
   :draw-fn   draw-level-01!
   :update-fn update-level-01})
