/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara30112022;

/**
 *
 * @author Mutiara Maharani
 */
public class Student extends Person {
    
    public Student(){
        super ("Ali","Padang");
        super.name="Ani";
        super.address="some address";
        System.out.println("Inside Student:Constructor");
     } 
    
    public static void main( String[] args ){
        Student anna = new Student();
        System.out.println(anna.name);
    } 
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
}