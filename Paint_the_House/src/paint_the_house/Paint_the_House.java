/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint_the_house;

import java.util.Scanner;

/**
 *
 * @author Bebe
 */
public class Paint_the_House {

    private static Object keyboard;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* This project is to help the user understand how much paint is needed
        to paint his/her house. 
        *
        * We need to declare all variables 
        * Also make sure we find out the house area (lxwxh)
        * Also, need to get the size and number of windows
        * Finally get the numbr and size of doors
        * Basically, we need to find out the house area and minus it by the 
        * doors and windows. Once we do that we will be able to find out how 
        * much paint is needed for the user.     
        */ 
         
        //greet and ask user name
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! Thank you for using my program! What is your"
                + " name?");
        String name= input.nextLine();
        System.out.println("");
    

       
//House measurements
System.out.println(name + ", we need to find out your house's area. What is the legnth of your house?");
 double h_length;
        h_length = input.nextDouble();
        System.out.println("");             
        
System.out.println(name + ", what is the width of your house?");
double h_width;
       h_width = input.nextDouble();
       System.out.println("");

System.out.println(name + ", what is the height of your house?");
double h_height;
       h_height = input.nextDouble();
       System.out.println("");

double h_area_total = (h_length + h_width + h_height)*2;
System.out.println("Ok " + name + ", the total area for your house equal too: " 
        + h_area_total);
      

System.out.println("Ok, and how many windows do you have in your home?");
int num_win;
       num_win = input.nextInt();
           
//will have to make a loop for this in future version
System.out.println("Enter the length of the windows.");
               double win_len_size;
        win_len_size = input.nextDouble();
        
System.out.println("Enter the width of the windows.");
        double win_wid_size;
        win_wid_size = + input.nextDouble();   

double total_win_size;
total_win_size = num_win*(win_len_size) + (win_wid_size)*num_win;        
System.out.println("Your windows measure at a total of " +total_win_size + " feet.");

int doors; //total amount of doors
double d__len_size; //size of doors length
double d_wid_size; //size of doors width
    
System.out.println("How many doors do you have on the outside of your home?");
    doors = input.nextInt();
                
System.out.println("What is the length of the doors?");
        double d_len_size = input.nextDouble();
        
System.out.println("What is the height of your doors?");
    d_wid_size = input.nextDouble();
 
    double d_size_total; 
    d_size_total = (doors * d_wid_size) + (doors * d_len_size);
    System.out.println("Your total area for the doors is " + d_size_total + " square feet.");
                     
        //bringing it all together to
    double fin_area_total = h_area_total + total_win_size + d_size_total; //total with doors and windows 
    double win_do_tot = total_win_size + d_size_total;
    double new_total = fin_area_total - win_do_tot;
    int paint; //400 sq feet or 1 paint can equals 15 gallons
    //int paint_total; //amount of paint you need to complete the job
        paint = (int) (new_total * 0.028316846592)/15;
                
    System.out.println("Your house area with everything included is equal to: " 
            + fin_area_total + " square feet.");
    
    System.out.println("Now we have to minus " + win_do_tot + " square feet, for"
            + " doors and windows.");
    
    System.out.println("The total area of feet you need for painting your house "
            + "is " + new_total + ".");
   
   
    }
}