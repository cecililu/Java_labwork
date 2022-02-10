import javax.swing.*;
public class Functionuse{
    public static void main(String args[]){
        
         String Num1 = JOptionPane.showInputDialog("Enter first number?");
         String Nam2= JOptionPane.showInputDialog("Enter second number?");
         int number1=Integer.parseInt(Num1);
         int number2=Integer.parseInt(Nam2);

           float avg= getAverage(number1,number2);
           System.out.println("The average is  "+avg);
           
    }
    public static float getAverage(int a, int b){
       float c=0;
       c=(a+b)/2;
       System.out.print(c);
       return c;    
    }


}