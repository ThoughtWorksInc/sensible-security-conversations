(ns ssc.website.website
  (:require [hiccup.page :refer [include-js include-css html5]]
            [config.core :refer [env]]
            [hiccup.util :refer [escape-html]]))

;-----------------------------------------------------

(defn head []
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:name    "viewport"
           :content "width=device-width, initial-scale=1"}]
   (include-css (if (env :dev) "/css/website.css" "/css/website.min.css"))
   (include-css "https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,700,800")
   ])

;-----------------------------------------------------

(defn index-page []
  (let [card "x"]
    (html5
     (head)
     [:body {:class "body-container"}
      [:div.bigcard
       [:h1 "Sensible Security Conversations"]
       ]
      ]
     ))
  )
