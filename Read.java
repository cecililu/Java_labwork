import javax.swing.*;
public class Read{
    public static void main(String args[]){
        String Name = JOptionPane.showInputDialog("Enter you suva name?");
        String Math= JOptionPane.showInputDialog("enter you marks in math?");
        String English= JOptionPane.showInputDialog("enter english marks");
        String Nepali= JOptionPane.showInputDialog("enter you marks in nepali?");
        
        int math_num=Integer.parseInt(Math);
        int eng_num=Integer.parseInt(English);
        int nepali_num=Integer.parseInt(Nepali);
        float percent=((math_num+eng_num+nepali_num)/3);
        System.out.println("Your name is  "+ Name + "  and your marks in math ,english and nepali is "+math_num +"  "+eng_num+" "+nepali_num);
        System.out.println("Percentage: "+ percent);

        
    }
}