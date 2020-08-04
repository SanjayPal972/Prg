import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=s.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		System.out.println("Sum Of Proper divisor is:"+ sum);
		
	}

}
