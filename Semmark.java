/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java1.Register.studentdetails;

/**
 *
 * @author AARTHI
 */
public class Semmark {
    

   public void mark() {
         //To change body of generated methods, choose Tools | Templates.
          Scanner scanner = new Scanner(System.in);
	    
	   int totalPoints = 0;
	   int totalCredits = 0;
	    
	    boolean moreClasses = false;
	    
	    do {
             
                             
		    
		    int credits = 0;
		    boolean validCredits = true;
		    do {
		    	validCredits = true;
		    	
                           
                                
			    System.out.println("Enter number of credits:");
			    String creditsString = scanner.nextLine();  
                               
			    try {
			    	credits = Integer.parseInt(creditsString);
			    }
			    catch (NumberFormatException nfe){
				    System.out.println("Please enter a valid integer");
				    validCredits = false;
			    }
		    }
		    while (!validCredits);
		    
		    
		    
		    boolean validGrade = true;
	
		    int gradeValue = 0;
		    String grade = "";
		    do {
		    	validGrade = true;
		    	   
                      
                                    System.out.println("Enter grade:");
			            grade = scanner.nextLine(); 
			   
			    
			    if (grade.equalsIgnoreCase("O")) {
			    	gradeValue = 10;
			    } else if (grade.equalsIgnoreCase("A+")) {
			    	gradeValue = 9;
			    } else if (grade.equalsIgnoreCase("A")) {
			    	gradeValue = 8;
			    } else if (grade.equalsIgnoreCase("B+")) {
			    	gradeValue = 7;
			    }
                            else if (grade.equalsIgnoreCase("B")) {
			    	gradeValue = 6;
			    }
                            else if (grade.equalsIgnoreCase("U")) {
			    	gradeValue = 0;
			    }else {
				    System.out.println("You didn't enter a valid grade :");
				    validGrade = false;
			    }
		    }
		    while (!validGrade);
		    
		    
		    int points = gradeValue * credits;
		    
		    totalPoints =totalPoints + points;
		    totalCredits =  totalCredits+ credits;
		    
		  
                    System.out.println("you have to enter (Y/N)");       
		    String moreClassesString = scanner.nextLine();  
		    
		    moreClasses = moreClassesString.equalsIgnoreCase("Y");
		    
	    }
	    while (moreClasses);
	    
	    
	    DecimalFormat df = new DecimalFormat("0.00");

	    Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);
	    
	    
	    System.out.println("Credits: " + totalCredits);  
	    System.out.println("Points: " + totalPoints);  
	    System.out.println("GPA: " + df.format(gpa));  
	    
	    
	    
	    studentdetails();


}
}

