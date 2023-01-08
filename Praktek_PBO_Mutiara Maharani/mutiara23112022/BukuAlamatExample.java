/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara23112022;

/**
 *
 * @author Mutiara Maharani
 */
import java.io.*;
public class BukuAlamatExample {
    
    public static void main(String[]args){
     BukuAlamat bukuAlamat[] = new BukuAlamat[100];
     int a[]=new int[100];
     BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
     int jumlah = 2;
     try{
     for (int i=0;i<jumlah;i++){
         System.out.println("Data Alamat ke -> "+ (i+1));
         BukuAlamat bukuAlamat1 = new BukuAlamat();
         System.out.print("Nama     : ");
         bukuAlamat1.setNama (dataIn.readLine());
         System.out.print("Alamat   : ");
         bukuAlamat1.setAlamat (dataIn.readLine());
         System.out.print("No Telpon: ");
         bukuAlamat1.setNotelp (dataIn.readLine());
         System.out.print("Email    : ");
         bukuAlamat1.setEmail (dataIn.readLine());
         bukuAlamat[i]=bukuAlamat1;
        }
     }catch(Exception ex){
     }
     //tampil
      System.out.println("==============Tampilan Data==============");
     for(int i=0;i<jumlah;i++){
         System.out.println("Data ke-> "+(i+1));
         System.out.println("Nama       : "+bukuAlamat[i].getNama());
         System.out.println("Alamat     : "+bukuAlamat[i].getAlamat());
         System.out.println("NoTelp     : "+bukuAlamat[i].getNotelp());
         System.out.println("Email      : "+bukuAlamat[i].getEmail());
         
         }
    }
}
