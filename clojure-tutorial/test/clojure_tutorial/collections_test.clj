(ns clojure-tutorial.collections-test
  (:require [clojure.test :refer :all]
            [clojure-tutorial.collections :refer :all]))

(deftest counting
  (testing "Count items in collection."
    (is (= (count three_items) 3))))

(deftest reversing
  (testing "Reverse items in collection."
    (is (= (reverse three_items) expected))))
