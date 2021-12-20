import javax.swing.*;
public class Loops{
    public static void main(String args[]){
        String Name = JOptionPane.showInputDialog("Enter you suva name?");
        String num= JOptionPane.showInputDialog("enter the number of times you want you name to be printed in the console?");
        
        int repeat_num=Integer.parseInt(num);
        for(int i=0;i < repeat_num;i++){
            System.out.println(Name);
        }
    }
}