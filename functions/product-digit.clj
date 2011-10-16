(defn pd[a b] 
   (map #(Integer/parseInt %)
         (re-seq #"[0-9]" (str (* a b)))
   )
)

(prn (= (pd 1 1) [1]))

(prn (= (pd 99 9) [8 9 1]))

(prn (= (pd 999 99) [9 8 9 0 1]))