(ns om-sync.core
  (:require [cljs.core :as cljs]
            [om.core :as om]))

(defmacro sync-component
  "Sugar over specify! for quickly putting together om-sync and IRender implementation."
  [data owner {:keys [url] :as opts} & body]
  `(cljs/specify!
     (~'om-sync.core/om-sync-impl
       {:url ~url
        :coll ~data}
       ~owner
       ~opts)

     om.core/IRender
     (~'render [this#]
      ~@body)))
