import java.util.*;
import java.lang.*;
class monThread extends Thread {
    public monThread(){
        super("mont");
    }
    public void run () {
         for (int i =1 ; i <5 ; i ++)
        System . out . println ( " je suis le thread " + getName () + " i = " + i ) ;
    }
}

public class exo1 {
    public static void main ( String args []) {
        List<Thread> tabRef=new ArrayList<>();
        for(int i=0;i<10;i++){ 
            Thread th1 = new monThread () ;
            //th1.setName("th"+i);//changement de nom pour le thread
            System.out.println("essai"+th1);//affiche la reference du thread
             //System.out.println("le thread actif "+);
            tabRef.add(th1);
        }
        for(int j=0;j<10;j++){
            tabRef.get(j).start();
        }
        for(int k=0;k<10;k++){
            
             try{
                 tabRef.get(k).join();
                
             }catch(InterruptedException e){
            e.printStackTrace();
            }
        }
        System . out . println ( " Le nombre de thread est : "+Thread.activeCount() ) ;
        System . out . println ( " Je suis le thread principal " ) ;
 }
}