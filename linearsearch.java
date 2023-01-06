package pushpa;

import java.util.Scanner;

public class linearsearch {
	public static void main(String args[])
	{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of elements");
			int n=sc.nextInt();
			int count=0;
			String[] a=new String[n];
			System.out.println("enter the elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.next();
			}
			System.out.println("enter the item to be searched");
			String item=sc.next();
			for(int i=0;i<n;i++)
			{
				if(a[i].equals(item)) 
				{
					System.out.println("item found at\t"+ i);
					count++;
					
			
				}	
			}
			System.out.println(count);
	}

}
