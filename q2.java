package raceToQualify;
import java.util.*;

public class q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of test cases ");
		int t=sc.nextInt();
		int count=0;
		int n;

		for(int i=0; i<t; i++)
		{
			
			System.out.print("Enter your response. 0=R, 1=P, 2=S ");
			n=sc.nextInt();
			int comp= (int)(n*Math.random());
			
			switch(n)
			{
				case 0:
					System.out.println("Your response is R");
					if(comp==0)
					{
						System.out.println("Computer's response is R. It's a TIE!");
					}
					
					if(comp==1)
					{
						System.out.println("Computer's response is P. You LOSE!");
					}
					
					if(comp==2)
					{
						System.out.println("Computer's response is S. You WIN!");
						count=count+1;
					}
					break;
					
					
				case 1:
					System.out.println("Your response is P");
					if(comp==0)
					{
						System.out.println("Computer's response is R. You WIN!!");
						count=count+1;
					}
					
					if(comp==1)
					{
						System.out.println("Computer's response is P. It's a TIE!");
					}
					
					if(comp==2)
					{
						System.out.println("Computer's response is S. You LOSE!");
					}
					break;
					
					
				case 2:
					System.out.println("Your response is S");
					if(comp==0)
					{
						System.out.println("Computer's response is R. You LOSE!");
					}
					
					if(comp==1)
					{
						System.out.println("Computer's response is P. You WIN!");
						count=count+1;
					}
					
					if(comp==2)
					{
						System.out.println("Computer's response is S. It's a TIE!");
					}
					break;
					
					default:
						System.out.println("Invalid response!");
			}
		}
if(count>t/2 && count<=t)
{
	System.out.println(t+ " rounds over. User scored " +count+ " .User won the game");
}
else if(count==t/2)
	System.out.println(t+ " rounds over. User scored " +count+ " .It's a tie.");

else
{
	System.out.println(t+ " rounds over. User scored " +count+ " .User won the game");
}
	}
}
