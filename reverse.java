public class reverse{
    public static void main(String args[])
    {
        System.out.println("enter the number");
        long rem,ans=0,count=0;
        long no=new java.util.Scanner(System.in).nextLong();
        while(no!=0)
        {
            rem=no%10;
            no=no/10;
            ans=ans*10+rem;
            count++;
        }
      System.out.printf("%0"+count+"d",ans);
    //   System.out.println(count);
        
    }
}