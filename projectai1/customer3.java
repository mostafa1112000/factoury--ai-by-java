/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectai1;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FAGR
 */
public class customer3 extends Agent{
    
    
      @Override
    protected void setup(){
        
        
        
          System.out.println("THE PRODACT IS AVAILBLE [  PRODACT1 , PRODACT2 , PRODACT3 ]\n ");  
         
      
        System.out.println("ENTER THE DIGET PRODCT [ 1 OR  2 OR 3 ]\n");
        
        
        Scanner inputNum= new Scanner(System.in); 
      
         String prodnum;
        prodnum=inputNum.next() ;
        
        
        
          ACLMessage acl=new ACLMessage();
          acl.addReceiver(new AID("factory",false));
          acl.setContent(prodnum);
            acl.setPerformative(ACLMessage.INFORM);
            send(acl);
          
        
        
        
    }
    
    
    @Override
   protected void takeDown(){
       
       
   }
    
}
