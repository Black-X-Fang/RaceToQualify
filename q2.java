package raceToQualify;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter User's choice");
//Use 0-Rock, 1-Paper, @-Scissor
int n=sc.nextInt();
int comp=(int)((n*Math.random()));
sc.close();
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
		}
		break;
		
		
	case 1:
		System.out.println("Your response is P");
		if(comp==0)
		{
			System.out.println("Computer's response is R. You WIN!!");
		}
		
		if(comp==1)
		{
			System.out.println("Computer's response is P. It's a TIE!!");
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
		}
		
		if(comp==2)
		{
			System.out.println("Computer's response is S. It's a TIE!");
		}
		break;

}
	}


}
