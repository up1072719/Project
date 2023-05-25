package gr.upatras.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int a,b;
    	a=10;
    	b=11;
    	subtract(a,b);
    }

    public static String subtract(int a,int b) {
    	String out;
        int result = a - b;
        if (result >= 0) {
        	out= "POSITIVE";
        } else {
        	out= "NEGATIVE";
        }
        System.out.println(out);
        return out;
        
    }
}
