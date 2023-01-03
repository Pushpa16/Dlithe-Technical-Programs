import java.util.Scanner;
public class checknumber{
    public static void main(String args[])
    {
       
       Scanner sc=new Scanner(System.in);
       char cont;
       do{
           System.out.println("enter the number to check");
        int n=new java.util.Scanner(System.in).nextInt();
       if(n>0)
            System.out.println("the no is postive");
        else if(n<0)
            System.out.println("the no is negative");
        else
            System.out.println("the no is zero");
        System.out.println("want to check more [Y]es/[N]o");
        cont=sc.next().charAt(0);
       }
        while(cont=='Y'||cont=='y');
       
            
    }
}