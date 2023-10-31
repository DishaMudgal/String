
public class palindromeString {

	public static void main(String[] args) {
 String s="abcduicba";
 int n=s.length();
 boolean isPalindrome=false;
 System.out.println(s.length());
 for(int i=0;i<(n/2);i++) {
	 if(s.charAt(i)==s.charAt((n-1)-i)) {
		isPalindrome=true; 
	 }
	 
	 
	 else {
		 isPalindrome=false;
		 break;
	 }
 }
 if(isPalindrome) {
	 System.out.println("the word "+ s +" is a palindrome");

 }else {
	 System.out.println("the word "+ s +" is a not palindrome");
 }

	}

}
