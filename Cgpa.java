/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java1.Register.studentdetails;

/**
 *
 * @author AARTHI
 */
public class Cgpa 

{

  public static void gpacal()
  {
     double cgpa, total=0;
     double a;
     
     
     Scanner m=new Scanner(System.in);
     System.out.println("Enter current semester:");
     int n=m.nextInt();
    
     System.out.println("Enter sem GPA:");
     for(int i=1;i<=n;i++)
     {
        a =m.nextDouble();
         total=total+a;
     }
     
      cgpa=total/n;
      System.out.println("Overall CGPA : "+cgpa);
      studentdetails();   
          
  }
         //To change body of generated methods, choose Tools | Templates.
         
    
}
