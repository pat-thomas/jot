(ns ^:figwheel-always
  jot.core
  (:require [reagent.core       :as reagent]
            [jot.components.nav :as nav]))

(enable-console-print!)

(defonce app-state
  (reagent/atom {}))

(defn app-root []
  []
  [:div
   [:div (nav/self)]
   [:div "the rest of the app will go here"]])

(defn main
  []
  (reagent/render-component
   [app-root]
   (. js/document (getElementById "app"))))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )

(main)
