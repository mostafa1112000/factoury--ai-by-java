/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectai1;



import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author FAGR
 */
public class factory extends Agent  {
  

    //////////////////////////////////////////////$$$$$$$$$$$$$$$$$$$$$$$$$$$   PRODCT(1)   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$///////////////////////////////////////////////////
 
        
 
    public void prodct1(){
        
        System.out.println("Please Enter The Number of prodcat [1] need THE AMOUNT AVAIBLE IS FROM [ 1 TO 15 ]\n " );
      Scanner input= new Scanner(System.in); 
      
         int prod;             //this is varible tot recive the number of one prodct
         
         int price;            //this varible to recive the price of prodcat which the cusomer take
        
            for(int i=15 ;i>=0 ; i=i-prod){ 
                  
                System.out.println("THE AMOUNT IS AVAIBLE NOW FROM PRODCT 1  : ="+i+"\n");
                  
                  
             prod=input.nextInt();
             
             if(prod > i){
                 
                 System.out.println("THE REQURIRED AMOUNT IS  BIGER $$ PLEASE TRAY ENTER THE AMOUNT TRUE AGAINE");
                   
                      prod=input.nextInt();
             }
             
              
             // this condition mack Discount if numer of customer take from prodct =10
             
               if(prod==10){ 
                   
               
                      System.out.println("THE FICTORY WILL BE MAKING DISCOUNT YOU WILL PAY 9$ INSTED OF 10\n");
       }
        
        System.out.println("PLEAse ENTER THE Palance  OF OF THE GET PRODCT\n");
         
        
        
                Scanner pricee= new Scanner(System.in);
                
                price=pricee.nextInt();
                 
               if(price==prod ){
                   
                   System.out.println("THE OPERATION IS SUCCESSED\n");
                   
                   System.out.println("Please Enter The Number of UNIT prodcat(1) need\n");
               }
               
               
               else if(price>prod){
               
                       System.out.println("THE MONY IS MORE RIQURIDE\n");
                             
       }
                
               
               else
               {
                   System.out.println("THE MONY IS NOT ENOUGH\n"); 
              }
              
              
              }
              
   System.out.println("This prodct 1 is empty AND THE (PRODCT 2 , PRODCT 3)IS AVAIBLE\n ");
   
   Scanner inp=new Scanner(System.in);
  
   int nupro=inp.nextInt();
   
       if(nupro==2){
     
            prodct2();
     
     }
     
     else if(nupro==3){
     
            prodct3();
     
     }
     
     
     else{
     
         System.out.println("ENTER THE COREECT NUMBER !!!\n");
     }
   
        
            
    }
    
     //////////////////////////////////////////////////////$$$$$$$$$$$$$$$$$$$$$$$$$$$   PRODCT(2)   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$///////////////////////////////////////////////////
 
    
    public void prodct2(){
    
       System.out.println("Please Enter The Number of prodcat (2) need THE AMOUNT AVAIBLE IS FROM [ 1 TO 15 ]\n");
      Scanner inpu= new Scanner(System.in); 
      
        
          int price2;               //this is varible tot recive the number of one prodct
          
         int prod2;                  //this varible to recive the price of prodcat which the cusomer take
         
              for(int i=15 ;i>=0 ; i=i-prod2){
                  
                     System.out.println("THE AMOUNT IS AVAIBLE NOW FROM PRODCT 2  : ="+i+"\n");
                  
                  prod2=inpu.nextInt();
                  
                  
                   if(prod2 > i){
                   
                 System.out.println("THE REQURIRED AMOUNT IS  BIGER $$ PLEASE TRAY ENTER THE AMOUNT TRUE AGAINE");
             
                      prod2=inpu.nextInt();
             }
              
               // this condition mack Discount if numer of customer take from prodct =10
              
               if(prod2==10){
               
                       System.out.println("THE FICTORY WILL BE MAKING DISCOUNT YOU WILL PAY 9$ INSTED OF 10");
                             
       }
        
        System.out.println("PLEAse ENTER THE Palance OF OF THE GET PRODCT\n");
         
        
        
                Scanner pricee= new Scanner(System.in);
                
                price2=pricee.nextInt();
                
                if(price2==prod2){
                   
                   System.out.println("THE OPERATION IS SUCCESSED\n");
                   
                   System.out.println("Please Enter The Number of UNIT prodcat(2) need\n");
               }
               
               
               else if(price2>prod2){
               
                       System.out.println("THE MONY IS MORE RIQURIDE\n");
                             
       }
                
               
               else
               {
                   System.out.println("THE MONY IS NOT ENOUGH\n"); 
              }
              
              
              }
              
              ///////////////////////////////////////////////////////
              
   System.out.println("This prodct (2) is empty AND THE( PRODCT 3, PRODCT 1 )IS AVAIBLE");
   
   
   
     Scanner inp=new Scanner(System.in);
  
   int nupro=inp.nextInt();
   
       if(nupro==1){
     
            prodct1();
     
     }
     
       else if(nupro==3){
     
            prodct3();
     
     }
     
     
     
     else{
     
         System.out.println("ENTER THE COREECT NUMBER !!!\n");
     }
   
    
    
    }
    
    
    
     ////////////////////////////////////////////////////####################      prodct (3)  $$$$$$$$$$$$///////////////////////////////////////////////////
   
    
    
    public void prodct3(){
    
    
      
        System.out.println("Please Enter The Number of prodcat (3) need THE AMOUNT AVAIBLE IS FROM [ 1 TO 15 ]\n");
      Scanner inpuu= new Scanner(System.in); 
      
        
         int price3;            //this is varible tot recive the number of one prodct
         int prod3;             //this varible to recive the price of prodcat which the cusomer take
         
         
              for(int i=15 ;i>=0 ; i=i-prod3){
                  
                     System.out.println("THE AMOUNT IS AVAIBLE NOW FROM PRODCT 2 : ="+i+"\n");
                     
                    prod3=inpuu.nextInt();
              
                    
                    
                     if(prod3 > i){
                   
                 System.out.println("THE REQURIRED AMOUNT IS  BIGER $$ PLEASE TRAY ENTER THE AMOUNT TRUE AGAINE");
             
                      prod3=inpuu.nextInt();
             }
                    
                    
               // this condition mack Discount if numer of customer take from prodct =10
                     if(prod3==10){
               
                       System.out.println("THE FICTORY WILL BE MAKING DISCOUNT YOU WILL PAY 9$ INSTED OF 10\n");
                             
       }
        
          System.out.println("PLEAse ENTER THE Palance OF OF THE GET PRODCT\n");
         
        
        
                Scanner pricee= new Scanner(System.in);
                
                price3=pricee.nextInt();
                
               if(price3==prod3){
                   
                   System.out.println("THE OPERATION IS SUCCESSED\n");
                   
                   System.out.println("Please Enter The Number of UNIT prodcat(3) need\n");
               }
               else if(price3>prod3){
               
                       System.out.println("THE MONY IS MORE RIQURIDE\n");
                             
       }
                
               
               else
               {
                   System.out.println("THE MONY IS NOT ENOUGH\n"); 
              }
              
              
              }
                 //////////////////////////////////////////////////////
              
   System.out.println("This prodct 3 is empty AND THE (PRODCT 1, PRODCT 2 ) IS AVALIBLE \n");
   
   
   
   
       Scanner inp=new Scanner(System.in);
  
   int nupro=inp.nextInt();
   
       if(nupro==1){
     
            prodct1();
     
     }
     
       else if(nupro==2){
     
            prodct2();
     
     }
     
     
     
     else{
     
         System.out.println("ENTER THE COREECT NUMBER !!!\n");
     }
   
   
   
    }
   

   
       //////////////////////////////////////////////////////////  THIS IS METHOD SETUP   ///////////////////////////////////////////////////////////////
    
    @Override
    protected void setup(){
        
        JOptionPane.showMessageDialog(null, "THE FACTORY IS CREATED AND THE NOW CAN BE RECEIVE THE MESSAGES");
        
        
        addBehaviour(new CyclicBehaviour() {

            @Override
            public void action() {
               
                ACLMessage aa = receive();
                 if(aa!=null){
                 String prodc=aa.getContent();
            
                   int nupro=Integer.parseInt(prodc);        
       
      //  wacker w=new wacker(this, 1000);
        
        //addBehaviour(w);
//          
//        
//        System.out.println("THE PRODACT IS AVAILBLE [PRODACT1 ,PRODACT2 ,PRODACT]3\n ");
//        
//        System.out.println("ENTER THE DIGET PRODCT [  1 OR 2 OR 3 ]\n");
//   
        
        // oneshot s= new oneshot();
        //  addBehaviour(s);
       
  
//       int prodc;  ///// numer of prodct abear the one prodct or tow prodct or three prodct ???????????????????
//       
//         Scanner prodct= new Scanner(System.in);
//                
//                prodc=prodct.nextInt();
//                
                 
                  
                 
     if(nupro==1){
   

              prodct1();
    
     
              }
     
     else if(nupro==2){
     
            prodct2();
     
     }
     
     else if(nupro==3){
     
            prodct3();
     
     }
     
     
     else{
     
         System.out.println("ENTER THE COREECT NUMBER !!!\n");
     }
     
         
                 }
            }
        
        });
    
    
}
    
    
}

    
    
    
              
  


    
        
        
        
    
    
    
  

 
    

    
        
        
        
    
    
    
  

 
    
