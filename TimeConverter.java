/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01;

import java.util.Scanner;

/**
 *
 * @author Spencer Bouchard
 */
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variable Declartion
        String time24;
        String hourStr;
        String minStr;
          
        // Title and program description       
        System.out.println("Assignment01");
        System.out.println("Bouchard, Spencer");
        System.out.println("A00404180");
        System.out.println("This program intakes 4 digits that represents a time on "
        + "the 24 hour time clock\nand converts it to a time on a 12 hour clock.\n");
       
        // Asks for user input
        System.out.print("Enter a 4 digit 24h time: ");
        Scanner keyboard = new Scanner(System.in); 
        time24 = keyboard.nextLine();
    
        // Ensures user input is a valid length
        if(time24.length() != 4){
        
            System.out.println("Error: invalid input " + time24);
            System.out.println("Press enter to end...");
            keyboard.nextLine();
            System.exit(0);
        
        }
    
        // Ensures all characters entered are digits
        for(int i = 0; i < time24.length(); i++){
            
            if(!Character.isDigit(time24.charAt(i))){
                System.out.println("Error: invalid input " + time24);
                System.out.println("Press enter to end...");
                keyboard.nextLine();
                System.exit(0);
            }
            
        }
        
        // Adds values in string for hours and minutes
        hourStr = time24.substring(0,2);
        minStr = time24.substring(2,4);
    
        // Turns string values into integers values for hours and minutes
        int hourInt = Integer.parseInt(hourStr);
        int minInt = Integer.parseInt(minStr);
  
        // Outputs converted time if a valid time was entered
        if(hourInt == 0 && minInt < 60){
        
            System.out.println(time24 + " is 12:" + minStr + " am");
        
        }else if(hourInt <= 11 && minInt < 60){
        
            System.out.println(time24 + " is " + hourInt + ":" + minStr + " am");
        
        }else if(hourInt == 12 && minInt < 60){
        
            System.out.println(time24 + " is " + hourInt + ":" + minStr + " pm");
        
        }else if (hourInt <= 23 && minInt < 60){
        
            int hourConverted = hourInt - 12;
            System.out.println(time24 + " is " + hourConverted + ":" + minStr + " pm");
        
        }else{
        
            System.out.println("Error: invalid input " + time24);
            System.out.println("Press enter to end...");
            keyboard.nextLine();
            System.exit(0);
        
        }
    
        // Ends program
        System.out.println("Press enter to end...");
        keyboard.nextLine();
        System.exit(0);
        
    } // END main
    
} // END class TimeConverter
