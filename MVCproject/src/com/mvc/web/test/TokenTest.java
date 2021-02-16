package com.mvc.web.test;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "¡Ú,¡Ù¡Ú,¡Ù¡Ú¡Ù";
		stringToken(str);
		splitTest(str);
	}

	private static void splitTest(String str) {
	System.out.println("=split=");
	String split[] =str.split(",");
	for(int i=0; i<split.length; i++)
		System.out.println(i+":"+split[i]);
	}

	private static void stringToken(String str) {
		System.out.println("=String Token=");
		StringTokenizer st =new StringTokenizer(str,",");
		for(int i =0; st.hasMoreTokens(); i++)
			System.out.println(i+":"+st.nextToken());
		
	}

}
