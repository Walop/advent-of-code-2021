(ns advent-of-code-2021.day1-test
  (:require
    [advent-of-code-2021.day1 :refer :all]
    [clojure.java.io :as io]
    [clojure.test :refer :all]))

(def input-file (io/resource "input_day1.txt"))

(deftest day1-test
  (testing "part 1"
    (->>
      (io/reader input-file)
      (process)
      (= 1233)
      (is)
      ))
  (testing "part 2"
    (->>
      (io/reader input-file)
      (process2)
      (= 1275)
      (is))
    )
  )
