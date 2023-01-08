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
import javax.swing.JOptionPane;
public class latiahan1_2 {
    public static void main(String[] args) {  
     double grade= 0; 
     String msg = " ";
     grade = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Your Grade :"));
    
    
       if (grade >= 90) {
           msg = "Excellent !";
       } else if ((grade < 90) && (grade >= 80)) {
          msg = "Good Job !";
       } else if ((grade < 80) && (grade >= 60)) {
           msg ="Study Harder ! ";
       } else {
           msg ="Sorry you failed";
       }
       JOptionPane.showMessageDialog(null, "Nilai anda " + grade+"\n"+msg);
 }
}
