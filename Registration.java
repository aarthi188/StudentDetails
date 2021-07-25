/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
import java.util.Scanner;
import java.lang.String;



class Register{
    
    
   public static String firstname;
   public static String pwd;
   public static String email;
   public static String mob;
    
    
    
  public static  void Register()
    {
          Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("          REGISTRATION");
        System.out.println("-------------------------------");
        System.out.println("Enter your first name => ");
        firstname=sc.nextLine();
        System.out.println("Enter your last name => ");
        String lastname=sc.nextLine();
        System.out.println("Enter your emailId => ");
        email=sc.nextLine();
        System.out.println("Enter your Mobile number => ");
        long mob=sc.nextLong();
        long phn=mob%1000;
        String pass1=Long.toString(phn);
        pwd=email.concat(pass1);
        
  
        System.out.println("You have Registered Successfully!!!");
          System.out.println("You can Login either via Password or via OTP");
          System.out.println("-----------------------------");
          System.out.println("Press 1 to login via Password");
          System.out.println("Press 2 to login via OTP");
          System.out.println("-----------------------------");
           
   int ch;
        
        ch=sc.nextInt();
        if(ch==1)
        {
           Pass(); 
        }
        else if(ch==2)
        {
          OTP();
        }

    }
  
  
  public static void OTP()
        {  
        System.out.println("-------------------------------");
        System.out.println("Your username is => "+email);
        System.out.println("Your OTP is => "+pwd);
        System.out.println("-------------------------------");
        Login r=new Login();
        r.Login(email,pwd);
        
        }
     public static void Pass()
        {
            
         
         System.out.println("You can Login  via Password");
         
       
        System.out.println("-------------------------------");
        System.out.println("Your username is => "+firstname);
        System.out.println("Your password is => "+pwd);
        System.out.println("-------------------------------"); 
        Login r=new Login();
        r.Login(firstname,pwd);
        }
    
    
     public static void studentdetails()
        {
            Scanner sa=new Scanner(System.in);
            System.out.println("--------------");
            System.out.println("Student Information");
            System.out.println("--------------");

            System.out.println("1.Fees Details");
            System.out.println("2.GPA Calculation");
            System.out.println("3.CGPA Calculation");
            System.out.println("4.Exit");
            System.out.println("--------------");
            System.out.println("Enter your choice:");
            int a;
            a=sa.nextInt();


            switch(a)
            {

                case 1:
                    fee d=new fee();
                    d.academics();
                    
                    break;
                case 2:
                    Semmark s=new Semmark();
                    s.mark();
                   
                    break;
                case 3:
                    Cgpa c=new Cgpa();
                    c.gpacal();
                    
                    break;
                case 4:
                    System.out.println("-------------------------");
                    System.out.println("Thank you for visiting...");
                    System.out.println("-------------------------");
                    break;
                    
            }


        }
    
}


    


/**
 *
 * @author AARTHI
 */
public class Registration extends Register{
    

    public static void main(String args[])
    {
       Login s=new Login();
       s.Register();
       
   
    }
    
}
