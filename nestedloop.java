//package pushpa;
//
//public class nestedloop {
//
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//				for(int j=1;j<=5;j++) {
//						System.out.println("pushpa ");
//				}
//				System.out.println();
//		}
//	}
//
//}

//
//package pushpa;
//import java.util.Scanner;
//public class nestedloop {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//				for(int j=1;j<=i;j++) {
//						System.out.print(j +" ");
//				}
//				System.out.println();
//		}
//	}
//
//}



//package pushpa;
//import java.util.Scanner;
//public class nestedloop {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=n;i>=1;i--) {
//				for(int j=1;j<=i;j++) {
//						System.out.print(j +" ");
//				}
//				System.out.println();
//		}
//	}
//
//}


//package pushpa;
//import java.util.Scanner;
//public class nestedloop {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=n;i>=1;i--) {
//			for(int k=1;k<=n-i;k++)
//				System.out.print("  ");
//			for(int j=i;j>=1;j--) {
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
//	}
//
//}
//
//package pushpa;
//import java.util.Scanner;
//public class nestedloop {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) 
//					System.out.print(j);
//			for(int j=1;j<=(n-i)*2;j++)
//				System.out.print(" ");
//			for(int j=i;j>=1;j--)
//				System.out.print(j);
//			System.out.println();
//			
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) 
//					System.out.print(j);
//			for(int j=1;j<=(n-i)*2;j++)
//				System.out.print(" ");
//			for(int j=i;j>=1;j--)
//				System.out.print(j);
//			System.out.println();
//			
//		}
//	}
//
//}




package pushpa;
import java.util.Scanner;
public class nestedloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) 
					System.out.print(" ");
			for(int j=i+1;j<=n;j++)
				System.out.print(j);
			for(int j=n;j>=i+1;j--)
				System.out.print(j);
			for(int j=i;j>=1;j--)
				System.out.print(" ");
			System.out.println();
			
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) 
					System.out.print(" ");
			for(int j=i+1;j<=n;j++)
				System.out.print(j);
			for(int j=n;j>=i+1;j--)
				System.out.print(j);
			for(int j=i;j>=1;j--)
				System.out.print(" ");
			System.out.println();
			
		}
	}

}


//package pushpa;
//import java.util.Scanner;
//public class nestedloop{
//
//	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			if(i%4==0)
//				break;
//		System.out.println(i);
//		}
//	}
//
//}

