import java.util.*;
class courseThread extends Thread{
    private int compteur;
    public courseThread(){
        this.compteur=0;
    }
    public int getCompteur(){return this.compteur;}
    public void setCompteur(int compt){this.compteur=compt;}
    public void run(){
        for(int i=0;i<10;i++){
            this.compteur=compteur + 1;
            System.out.println("je suis le Thread " +getName());
        }
    }
}
public class exo3 {
    /**
     *
     */
  

    public static void main (String []arg){
        List<Thread> tabThread =new ArrayList<>();
        //un tableau de string qui à chaque test recupère le nom du thread
        List<String> nomThread=new ArrayList<>();
        for(int j=0;j<5;j++){
            Thread th=new courseThread();
            tabThread.add(th);
            th.start();
        }

        for(int k=0;k<5;k++){
            try{
                tabThread.get(k).sleep((int)(Math.random()*100));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            //if(tabThread.get(k).getCompteur()==10)
                System.out.println("Je suis le thread de rang "+tabThread.get(k));
        }
        
        
        
    }
    
}
