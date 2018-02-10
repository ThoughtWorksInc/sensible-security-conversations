(ns card-attempt.handler
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.route :refer [not-found resources]]
            [card-attempt.middleware :refer [wrap-middleware]]
            [card-attempt.threats :refer [threats-page]]
            [card-attempt.vulns :refer [vulns-page vulns-summary-page]]
            [card-attempt.assets :refer [assets-page]]
            ))

;-----------------------------------------------------

(defroutes routes
  (GET "/threats" [] (threats-page))
  (GET "/vulns-summary" [] (vulns-summary-page))
  (GET "/vulns" [] (vulns-page))
  (GET "/assets" [] (assets-page))

           (resources "/")
           (not-found "Not Found"))

(def app (wrap-middleware #'routes))
