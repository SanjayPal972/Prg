import java.util.Scanner;

public class Prog6 {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter The Number");
			int num=s.nextInt();
			if(num%2==0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number Is Odd");
			}
	}

}
