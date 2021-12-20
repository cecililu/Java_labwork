import javax.swing.*;
public class Fibo{
    public static void main(String args[]){
        String num = JOptionPane.showInputDialog
         ("How many numbers do you want in your series?");
        int number=Integer.parseInt(num);
        int a=0;
        int b=1;
        int c=0;
        for (int i=0;i< number;i++){
           System.out.println(c);
            c=a+b;
            a=b;
            b=c;

        }
    }
}
