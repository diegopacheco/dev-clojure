package com.github.diegopacheco.sandbox.java.clojure;

import clojure.lang.RT;
import clojure.lang.Var;

/**
 * 
 * @author Diego Pacheco
 *
 */
public class JavaCallsClojure {	
	public static void main(String args[]) throws Throwable{		
		try{
			// Load the Clojure function file
		    RT.loadResourceScript("calc.clj");
		    
		    // Get a Clojure Function refernce: namespace + func-name
		    Var calc = RT.var("user", "calc-sum");
		    
		    // Invoke the function passing parameters and get the results
		    Object result = calc.invoke(10, 25);
		    
		    // Print the results
		    System.out.println(result);
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}
