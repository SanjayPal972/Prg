import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=s.nextInt();
		while(num<=100)
		{
			if(num%3==0 || num%5==0 || num%3==0 && num%5==0)
			{
				
					System.out.println("Number Is:"+num);				
			}
			
		}
		
		

	}

}
