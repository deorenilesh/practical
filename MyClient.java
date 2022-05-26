import java.util.Scanner;
import java.rmi.*;

public class MyClient
{
		public  static void main(String argsj[]){

		try
		{
			Palindrome stub=(Palindrome)Naming.lookup("localhost");
			Scanner input=new Scanner(System.in);
			String str;
			System.out.println("Enter String 1:");
			str=input.nextLine();
	 		int m=stub.palin_drome(str);
		
			if(m==1)
			{
				System.out.println("The given string is a palindrome");
			}

			else{
				System.out.println("The given string is not palindrome");
			}
			
		}
		catch(Exception e){
				
				

		}


		
	}



}