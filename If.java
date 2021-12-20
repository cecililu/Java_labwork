import javax.swing.*;

public class If{
    public static void main(String args[]){
       String Percent = JOptionPane.showInputDialog("Enter you percentage?");   
       float percentage=Float.parseFloat(Percent);
       if (percentage>100){
           System.out.println("Invalid entry percentage cannot be higher than 100");
       }else{
           if (percentage>=80){
           System.out.println("Your grade is "+'A');
       }else if(percentage>=75 &&percentage<80){
            System.out.println("Your grade is "+'B');
       }else if(percentage>=65 &&percentage<75){
            System.out.println("Your grade is "+'C');

       }else if(percentage>=55 &&percentage<65){
            System.out.println("Your grade is "+'D');
       }else if(percentage>=40 &&percentage<5){
            System.out.println("Your grade is "+'E');

    }else{
        System.out.println("Your grade is "+"F");
    }
       }
}
}