/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package candystore;

import java.util.Scanner;

/**
 *
 * @author victor pc
 */
public class CandyStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
    }
    public static void WelcomeMessage(){
        System.out.println("hi welcome to our store");
        }
    
    public static String menu(){
    Scanner myInput =new Scanner(System.in);
    
        System.out.println("please chose you candy");
        System.out.println("chocolate");
        System.out.println("lollypop");
        System.out.println("M&Ms");
    String choose= myInput.nextLine();
    return choose;
    }
}
