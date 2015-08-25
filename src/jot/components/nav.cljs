(ns jot.components.nav
  (:require [reagent.core :as reagent]))

(defn self
  []
  [:div#nav
   (for [{:keys [href text] :as item} [{:href "/sign-out" :text "Sign Out"}
                                       {:href "/home" :text "Home"}]]
     [:a {:href href
          :text text}])])
