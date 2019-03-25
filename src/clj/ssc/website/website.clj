(ns ssc.website.website
  (:require [hiccup.page :refer [include-js include-css html5]]
            [hiccup.element :refer [image]]
            [config.core :refer [env]]
            [hiccup.util :refer [escape-html]]))

;-----------------------------------------------------

(defn head []
  [:head
   [:title "Sensible Security Conversations - Threat modelling workshop for agile software teams"]
   [:meta {:charset "utf-8"}]
   [:meta {:description "Sensible Security Conversations is a workshop based approach to threat modelling focussed on agile software development teams and modern cloud-based digital systems."}]
   [:meta {:name    "viewport"
           :content "width=device-width, initial-scale=1"}]
   (include-css "/css/bootstrap.css" "/css/bootstrap-responsive.css")
   (include-css "/css/website.css")
   (include-css "https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,700,800")
   ])

;-----------------------------------------------------

(defn index-page []
  (let [other-deck "/materials/SensibleSecurityConversations-NCSCDeveloperDen.pdf"
        motivation-deck "materials/Lessions-Learned-NCSC-Cyber17-Mar17.pdf"
        sens-deck "/materials/Sensible_Agile_Threat_Modelling_Deck.pdf"
        sens-cards "/materials/Sensible_Agile_Threat_Modelling_Cards.pdf"
        sens-guide "/materials/Sensible_Agile_Threat_Modelling_Workshop_Guide.pdf"
        expos-card "/materials/Sensible-Conversations-VulnerabilityExposureCards.pdf"
        threat-card "/materials/Sensible-Conversations-Threats.pdf"
        oreilly-talk "https://www.safaribooksonline.com/library/view/oreilly-security-conference/9781491985359/video316717.html"]
    (html5
     (head)
     [:body
      [:div.container-narrow
      [:div.masthead
       [:h1 [:image {:alt "Sensible Security Conversations"
                     :src "https://raw.githubusercontent.com/ThoughtWorksInc/sensible-security-conversations/master/banner-logo.png" :width "670"}]]
       [:p "Here are some materials to support agile threat modelling for software security on delivery teams, particularly using short, timeboxed, workshops with the STRIDE methodology."]
       [:hr]
       [:h2 "Timeboxed STRIDE"]
       [:ul
        [:li "Detailed workshop guide" [:a {:href sens-guide} " to agile threat modelling"] " for facilitators"]
        [:li "Slide deck to" [:a {:href sens-deck} " introduce team to STRIDE"] " and how to do Agile threat modelling"]
        [:li "Printable A5 Cue cards" [:a {:href sens-cards} " for STRIDE"] " to support workshop"]
        ]
       [:h2 "Background"]
        [:ul
        [:li [:a {:href other-deck} "Overview of motivations and approach"] " as given at NCSC Developers Den seminar"]
         [:li [:a {:href motivation-deck} "Motivation for approach"] " from lightening talk given at NCSC Cyber 17 Aglile Track"]
        [:li "Mostly outdated O'Reilly Talk by " [:a {:href "https://twitter.com/jgumbley"} "@jgumbley"] " with background thinking about finding a continuous" [:a {:href oreilly-talk} " approach"]]
       ]
       [:h2 "Security Objectives"]
       [:p "Sometimes you want to run an exercise with business stakeholders rather than focussed on technology. These can help."]
       [:ul
        [:li "Printable HTML of " [:a {:href "/threats.html"} "Threat Cards"] " for printing out on A4 paper"]
        [:li "PDF version of " [:a {:href threat-card} "Threat Cards"] " for printing out on A4 paper"]
        ]
       [:hr]
       [:table
        [:td [:image {:alt "Creative Commons"
                      :src "https://raw.githubusercontent.com/ThoughtWorksInc/sensible-security-conversations/master/cc.png" :width "80"}]]
        [:td "This work is licensed under a Creative Commons Attribution-ShareAlike 4.0 International License."]
        [:td [:image {:alt "ThoughtWorks"
                      :src "https://raw.githubusercontent.com/ThoughtWorksInc/sensible-security-conversations/master/twlogo.png" :width "80"}]]
        ]
       ]]
      ]
     ))
  )
