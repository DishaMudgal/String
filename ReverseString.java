import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	String reverseString="";
	 int n=s.length();
	 for (int i=0;i<n;i++)
	 {
		 reverseString=s.charAt(i)+reverseString; 
	 
	 }
	 System.out.println(reverseString);
		
	}
}


