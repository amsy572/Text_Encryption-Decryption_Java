/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Scanner;
public class Encryption {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        int key1,key2,choice;
        String text1, text2,choice2;
        
        
        System.out.println ("What Do You Want To Perform \n 1.Encryption \n 2.Decryption");
        choice = s.nextInt();
        
        
        switch(choice){
            
            case 1:
                System.out.println("Enter Text you Want to Encrypt :");
                text1 = s.next();

                System.out.println("By How Many Do You Want To Encrypt");
                key1 = s.nextInt();

                char[] Enc  = text1.toCharArray();

                for(char e : Enc){
                e += key1;
                 System.out.print(e) ;
                }
                System.out.println("\nPress (2) For Decryption");
                choice2 = s.next();
            case 2:
                    System.out.println("\nEnter The Ceaser Text To Decrypt :");
                    text2 = s.next();

                    System.out.println("By How Many Do You Want TO Decrypt");
                    key2 = s.nextInt();

                    char[] Dec  = text2.toCharArray();

                    for(char d : Dec){
                    d -= key2;
                     System.out.print(d) ;
                    }
                    
                break;
      
      }
        }
}

