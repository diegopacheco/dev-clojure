(defn pal[s] 
  (if (string? s) 
     (= s (apply str (reverse s)))
     (= s (reverse s))
  )
) 