/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        printDayOfTheWeek();
        dayOfTheWeek();
        //Normal example
        int value = 3;
        if (value == 1){
            System.out.println("Value was 1");
        }
        else if (value == 2){
            System.out.println("Value was 2");
        }
        else{
            System.out.println("Was not 1 or 2");
        }
        
        
        //Switch example
        int switchValue = 6;
        switch (switchValue){
            case 1 : 
                System.out.println("Value was 1");
                break;
            case 2 :
                System.out.println("Value was 2");
                break;
            case 3 : case 4: case 5:
                System.out.println("was 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default :
                System.out.println("Wan not 1, 2, 3, 4 or 5");
                break;
        }
        
        //Switch challenge
        char myChar = 'C';
        switch (myChar){
            case 'A':
                System.out.println("I found A");
                break;
            case 'B':
                System.out.println("I found B");
                break;
            case 'C':
                System.out.println("I found C");
                break;
            case 'D':
                System.out.println("I found D");
                break;
            case 'E':
                System.out.println("I found E");
                break;
            default :
                System.out.println("Nothing found");
                break;
        }
        
        //Switch challenge II
        String month = "JANUARy";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
        
        
    }
    // Challenge
    public static int printDayOfTheWeek (){
        Scanner sc = new Scanner(System.in);
        int day = 0;
        System.out.println("Input a number from 0 to 6 to tell you the day: (switch method)");
        day = sc.nextInt();
        if (day >=0 && day <= 6){
            switch (day){
                case 0:
                    System.out.println("Monday");
                    break;
                case 1:
                    System.out.println("Tuesday");
                    break;
                case 2:
                    System.out.println("Wednesday");
                    break;
                case 3:
                    System.out.println("Thursday");
                    break;
                case 4:
                    System.out.println("Friday");
                    break;
                case 5:
                    System.out.println("Saturday");
                    break;
                case 6:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }
        }
        return day;
    }
    
    public static int dayOfTheWeek(){
        Scanner sc = new Scanner (System.in);
        int day = 0;
        System.out.println("Input a number from 0 to 6 to tell you the day: (else if method)");
        day = sc.nextInt();
        if (day == 0){
            System.out.println("Monday");
        }
        else if (day == 1){
            System.out.println("Tuesday");
        }
        else if (day == 2){
            System.out.println("Wednesday");
        }
        else if (day == 3){
            System.out.println("Thursday");
        }
        else if (day == 4){
            System.out.println("Friday");
        }
        else if (day == 5){
            System.out.println("Saturday");
        }
        else if (day == 6){
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid day");
        }
    return day;   
    }
    
    
}
