/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**************************************************** 
Program Name: Week1Lab.java 
Programmer's Name: Edward Alvarado
Program Description: This program accepts user health information, calculates BMI, and max heart rate.
***********************************************************/

package week.pkg1.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author MrDivine
 */
public class Week1Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        // loop until user gives an "X"
        String name = "";
        
        while(true){
            System.out.print("Enter Name or 'X' to Quit: ");
            name = scan.nextLine();
            if(!name.equalsIgnoreCase("X")){
                // get the rest of the information
                System.out.print("Enter age: ");
                int age = scan.nextInt();
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                System.out.print("Enter height - feet: " );
                int feet = scan.nextInt();
                System.out.print("Enter height - inches: ");
                double inches = scan.nextDouble();  // 10 ENTER
                scan.nextLine(); // read until it hits '\n' or enter key  -- use up the enter key
                
                //show Health profile results
                HealthProfile hp = new HealthProfile(name, age, weight, feet, inches);
                System.out.println("\nHealth Profile for " +hp.getName());
                double bmi = hp.calculateBMI();
                DecimalFormat fmt = new DecimalFormat("0.0");
                System.out.println("BMI: " + fmt.format(bmi));
                System.out.println("BMI Category: " + hp.calculateCategory());
                System.out.println("Max heart rate: " + hp.calculateMaxHR());
                System.out.println("");
                
                
            }
            else
            {
                break; //breaks out of while loop
            }
        }    
        
    } // end of main
    
}// end of class
