(ns asteroids.sprites.rock
  (:require [quil.core :as q]
            [quip.util :as u]
            [quip.sprite :as sprite]
            [asteroids.common :as c]))

;; Move to utils namespace at some point.
(defn random-point
  "Returns a random [x y] within the sketch boundaries."
  []
  [(rand-int (q/width))
   (rand-int (q/height))])

(defn rand-between
  "Returns a random int between min and max (inclusive)."
  [min max]
  (+ min (rand-int (inc (- max min)))))

(defn generate-random-triangle
  []
  (let [min-size 5
        max-size 100
        x0 (rand-int (q/width))
        y0 (rand-int (q/height))
        x1 (+ x0 (rand-between min-size max-size))
        y1 (+ y0 (rand-between min-size max-size))
        x2 (- x0 (rand-between min-size max-size))
        y2 (+ y0 (rand-between min-size max-size))]
    [x0 y0 x1 y1 x2 y2]))

(defn update-rock
  []
  )

(defn draw-rock
  []
  (q/stroke c/white)
  (apply q/triangle (generate-random-triangle)))

(defn test-rock
  []
  (q/stroke c/white)
  (q/triangle 50 50 450 200 100 390))

(defn rock
  []
  (sprite/sprite
   :rocks
   [100 100]
   :update-fn identity
   :draw-fn test-rock))
