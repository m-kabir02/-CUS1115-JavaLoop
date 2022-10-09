import java.util.Scanner;
public class Loop_1
{
 public static void main(String[]args)
 {
     Scanner kb=new Scanner(System.in);
     int hrs;
     double rate;
     for(int i=1;i<=3;i++)
         // int i= employee 1.
         //i<=3 means there are less than or equal to three employees/loop will run three times only
         //i++ shows all three will be asked. 1, 2 and 3.
     {
         System.out.print("Enter hours for Employee "+i);
         hrs=kb.nextInt();

         System.out.print("Enter rate for Employee "+i);
         rate=kb.nextDouble();

         System.out.println("The salary for Employee "+i+" is "+(hrs*rate));
     }
}
}
