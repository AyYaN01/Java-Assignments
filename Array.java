import java.util.Scanner;
public class Array 
{
        public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int arr[];
        arr=new int[12];
        for(int i=0;i<=11;i++)
        {
            System.out.println("Enter Student Marks "+(i+1)+ " : ");
            arr[i]=s.nextInt();
        }
        for(int i=0;i<=11;i++)
        {
            System.out.println("Student "+(i+1)+" marks is: "+arr[i]);
        }
    }
}
