(ns application.core-test
  (:require [clojure.test :refer :all]
            [application.core :refer :all]))

(deftest dummy-function-test
  (testing "dummy-function"
    (is (= 3 (dummy-function 0)))
    (is (= 5 (dummy-function 4)))))
