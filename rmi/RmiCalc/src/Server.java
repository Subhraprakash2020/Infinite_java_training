import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
	public static void main(String[] args) {
		Hello obj;
		try {
			Calc calc = new CalcImpl();
			obj  = new HelloImpl();
			Naming.rebind("localhost", calc);
			System.out.println("Calsulation Server Started Wating for clients");
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
