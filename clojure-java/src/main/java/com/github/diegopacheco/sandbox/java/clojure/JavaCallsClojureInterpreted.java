package com.github.diegopacheco.sandbox.java.clojure;

import clojure.lang.RT;
import clojure.lang.Var;

/**
 * 
 * @author Diego Pacheco
 *
 */
public class JavaCallsClojureInterpreted {	
		
	private static final Var seq        =  RT.var("clojure.core", "seq"); 
	private static final Var type       =  RT.var("clojure.core", "type");
	private static final Var keyword    =  RT.var("clojure.core", "keyword"); 
	private static final Var hashMap    =  RT.var("clojure.core", "hash-map");
    private static final Var structMap  =  RT.var("clojure.core", "struct-map");
	
	public static void loadClojureScript(String script){
		try {
			 RT.loadResourceScript(script);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Object buildKeyword(String k){
		try {
			return keyword.invoke(k);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Object buildSeq(Object o){
		try {
			return seq.invoke(o);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Object buildUserTypeDef(String ns,String structDefName){		
		try {
			Var userType = RT.var(ns, structDefName);
			return userType.get();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}			
	}
	
	public static Var buildUserFunction(String ns,String func){		
		try {
			return RT.var(ns, func);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}			
	}
	
	public static Object infoType(Object o){
		try {
			return type.invoke(o);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
	
	public static Object buildHashMap(Object... mapArgs){
		try {
			Object userSeq  = buildSeq(mapArgs);
			return hashMap.applyTo((clojure.lang.ISeq)userSeq);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String args[]) throws Throwable{		
		try{

			loadClojureScript("company.clj");
		
			Object employeeStructDef = buildUserTypeDef("user","employee");
			System.out.println(infoType(employeeStructDef));			

			Object oEmployee = structMap.invoke(employeeStructDef,buildKeyword("name"),"Diego",buildKeyword("age"),26,
		    		                                              buildKeyword("role"),"Coach",buildKeyword("salary"),1000);
		    System.out.println(oEmployee);			
		    
		    Var hire = buildUserFunction("user", "hire");
		    Object r = hire.invoke(oEmployee);
		    System.out.println(r);
		    
		    Var printee = buildUserFunction("user", "print-employee");
		    Object r2 = printee.invoke(oEmployee);
		    System.out.println(r2);
		    
		    Var print = buildUserFunction("user", "print-employees");
		    Object result = print.invoke();
		    System.out.println(result);
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
	
}
