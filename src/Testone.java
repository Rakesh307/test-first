import java.util.Scanner;


public class Testone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int uppercase = 0, lowercase=0;
		
		String s = "RajjshdygbTTgfsgd";
		
	
		for( int i=0; i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
            	uppercase++;
            if(Character.isLowerCase(s.charAt(i))) 
            	lowercase++;
        }
            System.out.println(uppercase);
            System.out.println(lowercase);
        }	
	}


