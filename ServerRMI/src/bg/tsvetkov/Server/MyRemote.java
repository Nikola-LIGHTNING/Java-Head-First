package bg.tsvetkov.Server;

import java.rmi.*;

// a interface can only EXTEND another interface (it cannot implement it)
public interface MyRemote extends Remote {
        public String sayHello() throws RemoteException;
}
