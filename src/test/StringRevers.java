package test;

public class StringRevers {
	 String reverse = "";
     
	    public String reverseString(String str){
	         System.out.println(str);
	        if(str.length() == 1){
	            return str;
	        } else {
	        	System.out.println("Revers: "+reverse);
	        	System.out.println("str.charAt(str.length()-1): "+str.charAt(str.length()-1));
	            reverse += str.charAt(str.length()-1)
	                    +reverseString(str.substring(0,str.length()-1));
	            
	            return reverse;
	        }
	    }
	     
	    public static void main(String a[]){
	        StringRevers srr = new StringRevers();
	        System.out.println("Result: "+srr.reverseString("Mayank"));
	    }
}
