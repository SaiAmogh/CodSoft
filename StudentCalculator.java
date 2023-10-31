package javaproject;
import java.util.*;
public class StudentCalculator {
	public static void main(String args[])
	{
		int sum=0,n;
		float avgperc;
		char grade = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		n=sc.nextInt();
		int [] sub=new int[n];
		System.out.println("Enter the number of marks obtained out of 100 for each subject");
		for(int i=0;i<n;i++)
		{
			sub[i]=sc.nextInt();
			sum=sum+sub[i];
		}
		//System.out.println("Total marks:"+sum);
		//System.out.println("Average Percentage:");
		avgperc=(sum/n);
		if(avgperc>=90)
		{
			grade='A';
		}
		else if(avgperc>=80)
		{
			grade='B';
		}
		else if(avgperc>=70)
		{
			grade='C';
		}
		else if(avgperc>=60)
		{
			grade='D';
		}
		else if(avgperc<60)
		{
			grade='E';
		}
		System.out.println("Total marks:"+sum);
		System.out.println("Average Percentage:"+avgperc+"%");
		System.out.println("Grade:"+grade);	
		
		
	}

}