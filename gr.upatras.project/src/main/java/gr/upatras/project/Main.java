package gr.upatras.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int a,b;
    	a=getinput(1);
    	b=getinput(2);
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


public static int getinput(int pass) {
	int i;
    Scanner s= new Scanner(System.in);
    if (pass==1) {
    	System.out.println("Enther the first integer");
    	i= s.nextInt();}
    else {
    	System.out.println("Enther the second integer");
    	i= s.nextInt();}
    return i;
    
}
}
