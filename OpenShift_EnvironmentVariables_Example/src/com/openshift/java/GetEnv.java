package com.openshift.java;

import java.util.Map;

public class GetEnv {
	
	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder(); 
		Map<String, String> env = System.getenv(); 
		for (String key : env.keySet()) { 
		 sb.append(key + ": " + env.get(key)  + "\n"); 
		} 

		// now the StringBuilder sb contains  all the enviroment variables, and can be logged or displayed to the servlet or whatever

		System.out.println(sb.toString());
		
		
	}

}
