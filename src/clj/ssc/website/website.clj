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
  (let [other-deck "https://github.com/ThoughtWorksInc/sensible-security-conversations/raw/master/resources/materials/SensibleSecurityConversations-NCSCDeveloperDen.pdf"
        expos-card "https://github.com/ThoughtWorksInc/sensible-security-conversations/raw/master/resources/materials/Sensible-Conversations-VulnerabilityExposureCards.pdf"
        threat-card "https://github.com/ThoughtWorksInc/sensible-security-conversations/raw/master/resources/materials/Sensible-Conversations-Threats.pdf"
        oreilly-talk "https://www.safaribooksonline.com/library/view/oreilly-security-conference/9781491985359/video316717.html"]
    (html5
     (head)
     [:body {:class "body-container"}
      [:div.content
       [:h1 [:image {:alt "Sensible Security Conversations"
                     :src "https://raw.githubusercontent.com/ThoughtWorksInc/sensible-security-conversations/master/banner-logo.png" :width "670"}]]
       [:p "<b>Sensible Security Conversations</b> is a workshop based approach to threat modelling focussed on agile software development teams and modern cloud-based digital systems."]
       [:ul
        [:li [:a {:href other-deck} "Overview of approach"] " as given at NCSC Developers Den seminar"]
        [:li "PDF version of " [:a {:href threat-card} "Threat Cards"] " for printing out on A4 paper"]
        [:li "PDF version of " [:a {:href expos-card} "Exposure Cards"] " for printing out on A4 paper"]
        [:li "O'Reilly Talk by " [:a {:href "https://twitter.com/jgumbley"} "@jgumbley"] " with background " [:a {:href oreilly-talk} "about approach"]]
       ]
       [:p "This site currently holds the key materials to conduct the workshops, but it is a work in progress. More details will be added over the coming weeks and months."]
       [:table
        [:td [:image {:alt "Creative Commons"
                      :src "https://raw.githubusercontent.com/ThoughtWorksInc/sensible-security-conversations/master/cc.png" :width "80"}]]
        [:td "This work is licensed under a Creative Commons Attribution-ShareAlike 4.0 International License."]
        [:td [:image {:alt "ThoughtWorks"
                      :src "https://raw.githubusercontent.com/ThoughtWorksInc/sensible-security-conversations/master/twlogo.png" :width "80"}]]
        ]
       ]
      ]
     ))
  )
