import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("Enter Third number");
		int c=s.nextInt();
		if(c==sum)
			System.out.println("True");

	}

}
