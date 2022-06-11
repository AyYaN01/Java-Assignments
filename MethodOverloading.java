import java.util.Scanner;
public class MethodOverloading
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want the power of: ");
        double a=s.nextDouble();
        System.out.println("Enter the number of the power you want: ");
        double b=s.nextDouble();
        DecPower obj=new DecPower();
        int ans1=obj.power();
        double ans2=obj.power(a);
        double ans3=obj.power(a,b);
        System.out.println("Ans 1 is: "+ans1+"\nAns 2 is: "+ans2+"\nAns 3 is: "+ans3);
    }
}
class DecPower
{
    int power()
    {
        return 5*5;
    }
    double power(double n)
    {
        return n*n;
    }
    double power(double n, double p)
    {
        double pow=1;
        for(int i=1;i<=p;i++)
        {
            pow=pow*n;
        }
        return pow;
    }
}