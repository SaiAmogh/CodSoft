package javaproject;
import java.util.*;
public class NumberGame {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int low=1;
		int high=100;
		int rannum,attempt=0,guess;
		boolean play=true;
		String Playagain;
		while(play)
		{
			 rannum=r.nextInt(high-low+1)+low;
			 System.out.println("Random number has been generated");
			 boolean guessed=true;
			 System.out.println("Number of attempts for each round is 4");
			 while(guessed)
			 {
				 System.out.println("Enter your guess");
				 guess=sc.nextInt();
				 attempt=attempt+1;
				 if(guess==rannum)
				 {
					 System.out.println("Congratulations your guess is correct");
					 break;
				 }
				 else if(guess>rannum)
				 {
					 System.out.println("Your guess is too high");
					 System.out.println("Try again!!");
				 }
				 else if(guess<rannum)
				 {
					 System.out.println("your guess is too low");
					 System.out.println("Try again!!");
				 }
				 if(attempt==4)
				 {
					 System.out.println("Number of attempts you have reached is maximum!!");
					 System.out.println("The random number is:"+rannum);
					 break;
				 }
			 }
			 System.out.println("Do you want to play again!! (yes or no)");
			 Playagain=sc.next();
			 if(Playagain.equals("yes"))
			 {
				 play=true;
			 }
			 else
			 {
				 break;
			 }
		}
	}

}
