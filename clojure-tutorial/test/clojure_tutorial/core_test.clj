(ns clojure-tutorial.core-test
  (:require [clojure.test :refer :all]
            [clojure-tutorial.core :refer :all]))

(deftest a-test
  (testing "Zero equals to zero."
    (is (= 0 0))))
