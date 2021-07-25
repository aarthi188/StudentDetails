/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;
import static java1.Register.studentdetails;

/**
 *
 * @author AARTHI
 */
public class fee extends Studentinfo{
    
     public static int fees = 200000;
     public static  int fs=0;
  
   
    public static void academics()
    {
 
    Studentinfo d=new Studentinfo();
    Scanner z=new Scanner(System.in);
    System.out.println("enter fee you paid");
    int fp=z.nextInt();
    if(fp==fees)
    {
       System.out.println("you paid full fess!!"); 
    }
    if(fp<fees)
    {
        d.setManagement(fees);
        fs = fees-fp;
        System.out.println("total fees "+d.getManagement());
        System.out.println("Balance to need to pay " +fs);
        studentdetails();
    }
   
    }
   
   
}
