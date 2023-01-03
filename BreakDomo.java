package pushpa;

public class BreakDomo {

	public static void main(String[] args) {
		outer:
		for(int j=1;j<=5;j++) {
			inner: 
			for(int i=1;i<=10;i++) {
				if(i%4==0)
					break inner;
			System.out.println(i);
			}
		}
	}

}
