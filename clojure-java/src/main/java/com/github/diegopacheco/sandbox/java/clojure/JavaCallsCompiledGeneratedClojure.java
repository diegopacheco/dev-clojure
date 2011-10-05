package com.github.diegopacheco.sandbox.java.clojure;

public class JavaCallsCompiledGeneratedClojure {
	public static void main(String args[]) throws Throwable{		
		try{		    
			user.Person p = new user.Person("Diego",26);
			
			user.PrintPerson printer = new user.PrintPerson();
			
			printer.person(p);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}