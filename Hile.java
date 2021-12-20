import javax.swing.*;
public class Hile{
    public static void main(String args[]){
        String number=JOptionPane.showInputDialog("Enter a number ?");
        int num=Integer.parseInt(number);
        int i=1;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}