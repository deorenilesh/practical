import java.rmi.*;
import java.lang.*;
import java.rmi.server.*;

public class PalinRemote extends UnicastRemoteObject implements Palindrome{

	public PalinRemote() throws RemoteException
	{
		super();

	}
	
	public int palin_drome(String a) throws RemoteException
	{
		System.out.println("Hello");
		StringBuffer str=new StringBuffer(a);
		String str1=str.toString();
		StringBuffer str2=str.reverse();
		int b=str1.compareTo(str2.toString());
			
		if (b==0)
			return 1;

		else
			return 0;



}


}