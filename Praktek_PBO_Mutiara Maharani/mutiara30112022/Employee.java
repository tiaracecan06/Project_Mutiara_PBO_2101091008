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
public class Employee extends Person {
    
    @Override
    public String getName(){
    super.name = "Dodi";
    System.out.println("Person Name:" + name);
    return name;
 } 
}
