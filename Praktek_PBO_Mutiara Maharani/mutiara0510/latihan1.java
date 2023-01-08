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
public class latihan1 {
     public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    String name = "";
    String alamat = "";
    String Jurusan ="";

    try{ 
        System.out.print("Nama    :"); 
        name = dataIn.readLine();
        System.out.print("Alamat  :");
        alamat = dataIn.readLine();
        System.out.print("Jurusan :");
        Jurusan = dataIn.readLine();
        }catch( IOException e ){ 
         System.out.println("Error!");        
    }
    System.out.println("Hello, " + name + " di " + alamat + " Selamat Datang Di " + Jurusan); 

    } 
}
