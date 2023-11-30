package synchronizedtest; 

class Sender 
{ 
    public void send(String msg) 
    { 
        System.out.println("Sending"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println(msg + "Sent");
        
    } 
};
class ThreadedSend extends Thread 
{ 
    private String msg; 
    Sender  sender; 
    ThreadedSend(String m,  Sender obj) 
    { 
        this.msg = m; 
        this.sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 
};
public class SynchronizedTest {
	 public static void main(String args[]) 
	    { 
	        Sender s = new Sender(); 
	        ThreadedSend S1 = new ThreadedSend( " Hi " , s ); 
	        ThreadedSend S2 = new ThreadedSend( " Bye " , s ); 
	        S1.start(); 
	        S2.start(); 
	    }

}
