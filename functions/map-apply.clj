;;
;; when
;;
(defn map-apply[f c] (lazy-seq
  (when-let [s (seq c)] s
     (cons (f (first s))
       (map-apply f (rest s))))))

(prn (map-apply inc [2 3 4 5 6]))	
(prn (->> (map-apply inc (range)) (drop (dec 1e6)) (take 2)))

;;
;; when
;;
;(defn map-apply[f c] (lazy-seq
;  (let [s (seq c)]
;   (when (and s)
;     (cons (f (first s))
;       (map-apply f (rest s)))))))

;;
;; With loop/recur
;;
;(defn map-apply [f c]
;    (loop [l c s []]
;	  (if (empty? l) 
;		  s
;		  (recur (drop 1 l) (conj s (f (first l))))
;	  )
;    )
;)

;;
;; with let/dotimes/ref
;;
;(defn map-apply [f c]
;    (let [s (ref [])]
;      (dosync 
;	    (dotimes [i (count c)] 
;		   (alter s conj (f (nth c i)))
;		)
;	    @s
;	  )
;	)  
;)    