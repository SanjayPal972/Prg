import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=s.nextInt();
		while(num>0)
		{
			num=num/10;
			if(num<=9 && num!=0)
			{
				System.out.println("First Digit:"+num);
			}
		}

	}

}
