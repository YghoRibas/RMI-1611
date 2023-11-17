package server;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
        
public class Server implements IHello {
        
    public Server() {}

    public String sayHello() {
        return "Hello, world!";
    }
        
    public static void main(String args[]) {
        
        try {
            //Create and export a remote object
            Server obj = new Server();
            IHello stub = (IHello) UnicastRemoteObject.exportObject(obj, 0);

            //Register the remote object with a Java RMI registry
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9400);
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}