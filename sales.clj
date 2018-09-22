
(ns clojure.examples.sales
   (:gen-class))
   
(def hmap {})
(def hmape {}) 
(def hmapz {}) 
   
(defn disp[]
(println "********Sales Menu********")
(println "--------------------------")
(println " ")
(println "1. Display Customer Table")
(println "2. Display Product Table")
(println "3. Display Sales Table")
(println "4. Total Sales for Customer")
(println "5. Total Count for Product")
(println "6. Exit")
(println "Enter an option?"))





(defn option1[]


(def mapi2 (sort hmape))
(def cn(atom (count mapi2)))
(def x1(atom 0))
(while(< @x1 @cn)
(do
		(def z1 (nth mapi2 @x1))
		(def a1 (nth z1 0))
		(def a2 (nth z1 1))
		(def a3 (nth a2 1))
		(def a4 (nth a2 2))
		(def a5 (nth a2 3))
		
		(print (str a1))(print (str ":["))(print (str "\""a3"\""))(print (str "\""a4"\"" ))(print (str "\""a5"\""))(println "]")
		
		
		(swap! x1 inc)

)

)


)



(defn option2[]


(def mapi2 (sort hmap))

(def cn(atom (count mapi2)))
(def x1(atom 0))
(while(< @x1 @cn)
(do
		(def z1 (nth mapi2 @x1))
		(def a1 (nth z1 0))
		(def a2 (nth z1 1))
		(def a3 (nth a2 1))
		(def a4 (nth a2 2))
		
		
		(print (str a1))(print (str ":["))(print (str "\""a3"\""))(print (str "\""a4"\"" ))(println "]")
		
		(swap! x1 inc)

)

)


)



(defn option3[]
(def mapi2 (sort hmapz))
(def cn(atom (count mapi2)))
(def x1(atom 0))
(while(< @x1 @cn)
(do
		(def z1 (nth mapi2 @x1))
		(def z2 (nth z1 0))
		
		(def aa1 (nth z1 1))
		
		(def ax1 (nth aa1 1))
		
		(def ax2 (nth aa1 2))
		(def ax3 (nth aa1 3))
		
		(def a1 (Integer/parseInt ax1))
		
		(def a2 (Integer/parseInt ax2))
		(def a3 (Integer/parseInt ax3))
		
	    (def com1 (get hmap a2))
		(def com2 (get hmape a1))
		(def me1 (nth com1 1))
		(def me2 (nth com1 2))
		(def je1 (nth com2 1))
		(def je2 (nth com2 2))
		(def je3 (nth com2 3))
		
		(print (str z2))(print (str ":["))(print (str "\""je1"\""))(print (str "\""me1"\"" ))(print (str "\""a3"\""))(println "]")
		
		(swap! x1 inc)

)

)


)



(defn option4[]
(println "Enter the name:")
(def mapi2 (sort hmapz))
(def cn(atom (count mapi2)))
(def x1(atom 0))
(def ninp(read-line))
(def hmapx {})
(def hmapy {})
(while(< @x1 @cn)
(do
		(def z1 (nth mapi2 @x1))
		(def z2 (nth z1 0))
		
		(def aa1 (nth z1 1))
		
		(def ax1 (nth aa1 1))
		
		(def ax2 (nth aa1 2))
		(def ax3 (nth aa1 3))
		
		(def a1 (Integer/parseInt ax1))
		
		(def a2 (Integer/parseInt ax2))
		(def a3(atom (Integer/parseInt ax3)))
		
	
		
	    (def com1 (get hmap a2))
		(def com2 (get hmape a1))
		(def me1 (nth com1 1))
		(def me2 (nth com1 2))
		(def me3(atom (Float/parseFloat me2)))
		
		(def je (nth com2 0))
		;;(def ner (clojure.string/upper-case ninp))
		
		(def jex (nth com2 1))
		;;(def je1 (clojure.string/upper-case jex))
		(def je2 (nth com2 2))
		(def je3 (nth com2 3))
		
		     (cond
                  (= ninp jex)
				  (do
				       (def ni1 je)
					   
					   (def hmapx (merge-with into hmapx {@x1 @me3}))
					   (def hmapy (merge-with into hmapy {@x1 @a3}))
					   
				  )

              )
		
		
		
		
		(swap! x1 inc)

)

)
(def ks(keys hmapx))
(def xe11(atom 0))
(def xxe(atom (count ks)))
(def hmap1 {})
(while(< @xe11 @xxe)
   (do
       
	   
	   
	   (def suf (nth ks @xe11))
	   
	   (def nx1 (get hmapx suf))
	   (def nx2 (get hmapy suf))
	   (def nx3 (* nx1 nx2))
	   (def hmap1 (merge-with into hmap1 {@xe11 nx3}))
	 (swap! xe11 inc)
	 )

)
(def ds1 (reduce + (vals hmap1)))
(def ds (format "%.2f" (double ds1)))
(if(= ds1 0)(println "Total:" ds1)(println ninp ":" ds))


)




(defn option5[]

(println "Enter the product name:")
(def mapi2 (sort hmapz))
(def cn(atom (count mapi2)))
(def x1(atom 0))
(def ninp(read-line))
(def hmapx {})
(def hmapy {})
(while(< @x1 @cn)
(do
		(def z1 (nth mapi2 @x1))
		(def z2 (nth z1 0))
		
		(def aa1 (nth z1 1))
		
		(def ax1 (nth aa1 1))
		
		(def ax2 (nth aa1 2))
		(def ax3 (nth aa1 3))
		
		(def a1 (Integer/parseInt ax1))
		
		(def a2 (Integer/parseInt ax2))
		(def a3(atom (Integer/parseInt ax3)))
		
	
		
	    (def com1 (get hmap a2))
		(def com2 (get hmape a1))
		(def me (nth com1 0))
		(def mex (nth com1 1))
		;;(def me1 (clojure.string/upper-case mex))
		(def me2 (nth com1 2))
		(def me3(atom (Float/parseFloat me2)))
		;;(def nixx (clojure.string/upper-case ninp))
		
		(def je (nth com2 0))
		(def je1 (nth com2 1))
		(def je2 (nth com2 2))
		(def je3 (nth com2 3))
		
		     (cond
                  (= ninp mex)
				  (do
				       
					   
					   (def hmapx (merge-with into hmapx {@x1 me}))
					   (def hmapy (merge-with into hmapy {@x1 @a3}))
					   
				  )

              )
		
		
		
		
		(swap! x1 inc)

)

)

(def dsd (reduce + (vals hmapy)))
(if (= dsd 0)(println "Count:" dsd)(println ninp ":" dsd))



)








(defn sales-cal []


(def string1(slurp "prod.txt"))
(def string2(slurp "cust.txt"))
(def string3(slurp "sales.txt"))


(def dpe1(atom (clojure.string/split-lines string2)))
(def xe1(atom 0))
(def xxe(atom (count @dpe1)))

(while(< @xe1 @xxe)
   (do
	(def xe2(atom (nth @dpe1 @xe1)))
	(def stringe2 @xe2)
     (def dpe(atom (re-seq #"[^,|]+" stringe2)))
	 ;;(def dpe(atom (clojure.string/split stringe2 #"\|")))
	 
	 (def asae(atom (nth @dpe 0)))
	 (def tre @asae)

	 (def ste (Integer/parseInt tre))
	 (def hmape (merge-with into hmape {ste @dpe}))
	 
	 (swap! xe1 inc)
	 )

)


(def dp1(atom (clojure.string/split-lines string1)))
(def x1(atom 0))
(def xx(atom (count @dp1)))

(while(< @x1 @xx)
   (do
	(def x2(atom (nth @dp1 @x1)))
	(def string2 @x2)
     (def dp(atom (re-seq #"[^,|]+" string2)))
	 
	 (def asa(atom (nth @dp 0)))
	 (def tr @asa)
      (def st (Integer/parseInt tr))
	 
	 (def hmap (merge-with into hmap {st @dp}))
	 
	 (swap! x1 inc)
	 )

)






(def dpz1(atom (clojure.string/split-lines string3)))
(def xz1(atom 0))
(def xxz(atom (count @dpz1)))

(while(< @xz1 @xxz)
   (do
	(def xz2(atom (nth @dpz1 @xz1)))
	(def stringz2 @xz2)
     (def dpz(atom (re-seq #"[^,|]+" stringz2)))
	 
	 (def asaz(atom (nth @dpz 0)))
	 (def trz @asaz)

	 (def stz (Integer/parseInt trz))
	 ;;(println stz)
	 ;;(println @dpz)
	 (def hmapz (merge-with into hmapz {stz @dpz}))
	 
	 (swap! xz1 inc)
	 )

)




   (disp)
   (def r 1)
   (while true
        (do
         (def inp(read-line))
			(cond
				(= inp "1")(do(option1)(disp))
				(= inp "2")(do(option2)(disp))
				(= inp "3")(do(option3)(disp))
				(= inp "4")(do(option4)(disp))
				(= inp "5")(do(option5)(disp))
				(= inp "6")(do(println "Good Bye")(System/exit 0))
				:else(println "Enter correct choice")
			) 
             	)		  
			
		 
		)
		)
   
(sales-cal)









