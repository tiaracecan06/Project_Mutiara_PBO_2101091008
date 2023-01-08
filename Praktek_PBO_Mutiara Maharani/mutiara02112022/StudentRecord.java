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
public class StudentRecord {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    public StudentRecord() {
        this ("Alif","Padang",20);
    }

    public StudentRecord(String temp) {
        studentCount++;
        this.name = temp;
    }

    public StudentRecord(String name, String address, int age) {
        studentCount++;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public StudentRecord(double mGrade, double eGrade, double sGrade) {
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    }
    //area penulisan kode selanjutnya

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public double getAverage() {
        average = ((mathGrade + englishGrade + scienceGrade) / 3);
        return average;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void print(String temp) {
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);
    }

    public void print(double eGrade, double mGrade, double sGrade,double max) {
        System.out.println("Name:" + name);
        System.out.println("Math Grade:" + mGrade);
        System.out.println("English Grade:" + eGrade);
        System.out.println("Science Grade:" + sGrade);
        System.out.println("Nilai max:" + max);
    }
    
    public double getMax(){
        double max;
        max=mathGrade;
        
        //max=(max>englishGrade)? max:englishGrade;
        //max=(max>scienceGrade)? max:scienceGrade;
        
        max=(max>englishGrade)? max:englishGrade;
        max=(max>scienceGrade)? max:scienceGrade;
        
        return max;
    }
    
}
