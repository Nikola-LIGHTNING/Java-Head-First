package bg.tsvetkov.Server;

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    
    @Override
    public String sayHello() {
        return "Server says, 'Hey'";
    }
    
    public MyRemoteImpl() throws RemoteException { };
    
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            // Remote Hello is the name clients will need to look up in the rmi registry
            Naming.rebind("Remote_Hello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
