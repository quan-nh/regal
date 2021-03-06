(ns lambdaisland.regal.platform
  (:require [clojure.string :as str])) ;; clj

(defn hex->int [hex]
  (Long/parseLong hex 16))

(defn int->hex [i]
  (str/upper-case
   (Integer/toHexString i)))

(defn char->long [ch]
  (if (string? ch)
    (long (first ch))
    (long ch)))

(defn parse-int [i]
  (Long/parseLong i 10))
