import java.lang.Thread;

class curThread extends Thread{
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    } 
}
public class exo2 {
    

  public static void main ( String args []) {
	Thread th1 = new curThread();
	Thread th2 = new curThread() ;
    th1.setPriority(Thread.MAX_PRIORITY);
	th2.setPriority(12);
    
    th1.start();
    th2.start();
  }
}