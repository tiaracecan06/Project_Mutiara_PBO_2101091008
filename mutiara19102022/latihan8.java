/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara19102022;

/**
 *
 * @author Mutiara Maharani
 */
import java.io.*;
public class latihan8 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String nama = "";
        
        System.out.println("==Program Menginput Nama==\n");
        
        try {
            System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("Error!");
        }
        
        System.out.println("\n");
        
        int x = 1;
        do{
            System.out.println(nama);
            x++;
        } while(x<=100);
    }
}
