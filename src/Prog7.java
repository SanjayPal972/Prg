import java.util.Scanner;

public class Prog7 {
	
        public static void main(String[] args) {

			Scanner s=new Scanner(System.in);
			System.out.println("Enter The Number");
			int num=s.nextInt();
			int div=num;
			for(div=num;div<=num;div--)
			{
					if(num%num==0 && num%div!=0)
					{
						System.out.println(num + " Is Prime");
					}
					else
					{
						System.out.println(num +" Is Not Prime");
					}
			}
			
	}

}
