import java.rmi.*;

public interface Palindrome extends Remote{

public int palin_drome (String x)throws RemoteException;

}