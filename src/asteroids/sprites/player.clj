(ns asteroids.sprites.player
  (:require [quip.sprite :as sprite]
            [quip.util :as u]
            [quil.core :as q]
            [asteroids.common :as c]))

(def test-image "img/test.png")

(defn player
  []
  (sprite/image-sprite
   :player
   (u/make-pos [0.5 0.5])
   225
   225
   test-image))
