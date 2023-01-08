/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara02112022;

/**
 *
 * @author Mutiara Maharani
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        /// isi objek
        student1.setName("Tiara");
        student1.setAddress("Sicincin");
        student1.setAge(20);
        student1.setMathGrade(80);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(90);
        /// tampilkan
        System.out.println("Nama        :"+student1.getName());
        System.out.println("Alamat      :"+student1.getAddress());
        System.out.println("Umur        :"+student1.getAge());
        System.out.println("Matematika  :"+student1.getMathGrade());
        System.out.println("B.Inggris   :"+student1.getEnglishGrade());
        System.out.println("MIPA        :"+student1.getScienceGrade());
        System.out.println("Rata-rata   :"+student1.getAverage());
        System.out.println("Nilai max   :"+student1.getMax());
        System.out.println("==============================================");
        
        StudentRecord student2 = new StudentRecord();
        student2.setName("Arisya");
        student2.setAddress("Pariaman");
        student2.setAge(20);
        student2.setMathGrade(89);
        student2.setEnglishGrade(83);
        student2.setScienceGrade(85);
        student2.print("");
        student2.print(student2.getEnglishGrade(),
                student2.getMathGrade(),student2.getScienceGrade(),student2.getMax());
        
    }
    
}
