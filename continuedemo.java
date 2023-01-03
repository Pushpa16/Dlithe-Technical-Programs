package pushpa;

public class continuedemo {
	public static void main(String[] args) {
		String str="pushpa mangal";
		outer:
		for(int j=1;j<=str.length();j++) {
			for(int i=0;i<str.length();i++)
			{
				if("aeiou".contains(""+str.charAt(i)))
					continue outer;
				System.out.print(str.charAt(i));
			}
	}
	}

}
