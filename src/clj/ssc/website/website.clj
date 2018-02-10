(ns ssc.website.website
  (:require [hiccup.page :refer [include-js include-css html5]]
            [hiccup.element :refer [image]]
            [config.core :refer [env]]
            [hiccup.util :refer [escape-html]]))

;-----------------------------------------------------

(defn head []
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:description "Sensible Security Conversations is a workshop based approach to threat modelling focussed on agile software development teams and modern cloud-based digital systems."}]
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
      [:div.content
       [:h1 [:image {:alt "Sensible Security Conversations"
                     :src "https://raw.githubusercontent.com/ThoughtWorksInc/sensible-security-conversations/master/banner-logo.png" :width "670"}]]
       [:p "<b>Sensible Security Conversations</b> is a workshop based approach to threat modelling focussed on agile software development teams and modern cloud-based digital systems."]
       [:p "This site currently holds the key materials to conduct the workshops, but it is a work in progress. More details will be added over the coming weeks and months."]
       [:hr]
       [:ul
        [:li "Overview of approach as given at NCSC Developers Den seminar"]
        [:li "PDF version of Threat cards for printing out on A4 paper"]
        [:li "PDF version of Exposure cards for printing out on A4 paper"]
       ]
       [:hr]
       [:table
        [:td "CC logo"]
        [:td "This work is licensed under a Creative Commons Attribution-ShareAlike 4.0 International License."]
        [:td "TW logo"]
        ]
       ]
      ]
     ))
  )
