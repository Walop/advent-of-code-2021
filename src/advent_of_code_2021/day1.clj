(ns advent-of-code-2021.day1)

(defn process
  "Process part 1"
  [input]
  (with-open [rdr input]
    (->> (line-seq rdr)
         (map #(Integer/parseInt %))
         (partition 2 1)
         (filter (fn [x] (< (nth x 0) (nth x 1))))
         (count)))
  )

(defn process2
  "Process part 2"
  [input]
  (with-open [rdr input]
    (->> (line-seq rdr)
         (map #(Integer/parseInt %))
         (partition 3 1)
         (map (partial reduce +))
         (partition 2 1)
         (filter (fn [x] (< (nth x 0) (nth x 1))))
         (count)))
  )