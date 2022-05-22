import java.util.Scanner;
public class ifCondition
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
        	int sum=0;
        	float perc;
		System.out.println("Enter Subject 1 marks:");
		int S1=s.nextInt();
		System.out.println("Enter Subject 2 marks:");
		int S2=s.nextInt();
		System.out.println("Enter Subject 3 marks:");
		int S3=s.nextInt();
		System.out.println("Enter Subject 4 marks:");
		int S4=s.nextInt();
		System.out.println("Enter Subject 5 marks:");
		int S5=s.nextInt();
       		sum=S1+S2+S3+S4+S5;
        	perc=sum/500.0f*100.0f;
        	if(perc>=80)
        	{
        		System.out.println("Exceptional");
        	}
        	if(perc>=70&&perc<80)
        	{
            		System.out.println("Very Good");
        	}
        	if(perc>=60&&perc<70)
        	{
            		System.out.println("Good");
        	}
        	if(perc>=50&&perc<60)
        	{
            		System.out.println("Pass");
        	}
        	if(perc<50)
        	{
            		System.out.println("Fail");
        	}
	}
}