/*Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
*/

public class Palindrome {

	
	 public boolean isPalindrome(int x) {
	        int y;
	        int temp=0;
	        int num =x;
	        if(x<0)
	        	return false;
	    while(x!=0){
	    	
	            y=x%10;
	            temp= temp*10+y;
	            x=x/10;
	            
	        	System.out.println(temp);            
	        }
	        if(num==temp)
	            return true;
	        else
	            return false;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome Pal= new Palindrome();
		boolean x= Pal.isPalindrome(-121);
		System.out.println(x);
	}

}
