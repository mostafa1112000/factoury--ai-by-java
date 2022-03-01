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
public class customer1 extends Agent {
    
    
    
      @Override
    protected void setup(){
        
        
        
          System.out.println( "THE PRODACT IS AVAILBLE [ PRODACT1 , PRODACT2 , PRODACT3 ]\n "); 
        
        System.out.println("ENTER THE DIGET PRODCT [  1 OR 2 OR 3 ]\n");
        
        
        Scanner inputNum= new Scanner(System.in); 
      
         String prodnum;
        prodnum=inputNum.next() ;
        
        
        
        
        ////////////////////////////////////////////////////////////////////////////
   
//             System.out.println("Please Enter The Number of prodcat [1] need THE AMOUNT AVAIBLE IS FROM [ 1 TO 15 ]\n " );
//      Scanner input= new Scanner(System.in); 
//      
//         int unit    ;     //this is varible tot recive the number of one prodct
//         
//         int price;            //this varible to recive the price of prodcat which the cusomer take
//         unit=input.nextInt();
//        
//        System.out.println("PLEAse ENTER THE PRICE OF OF THE GET PRODCT\n");
//         
//        
//                Scanner pricee=new Scanner(System.in);
//                
//                price=pricee.nextInt();
//                
                /////////////////////////////////////////////////////////
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
