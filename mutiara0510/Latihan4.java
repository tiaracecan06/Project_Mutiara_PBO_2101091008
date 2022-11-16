/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara0510;

/**
 *
 * @author Windows 10
 */
 import java.io.*;
public class Latihan4 {
  
     public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    String word1 ="";
    String word2 ="";
    String word3 ="";
    

    try{ 
        System.out.print("Enter word 1  : "); 
        word1 = dataIn.readLine();
        System.out.print("Enter word 2  : ");
        word2 = dataIn.readLine();
        System.out.print("Enter word 3  : ");
        word3 = dataIn.readLine();
        }catch( IOException e ){ 
         System.out.println("Error!");        
    }
   
   System.out.println( word1+ " " + word2 + " " + word3 );

    } 
}

