public class Loops 
{
    public static void main(String args[])
    {
        int a=1,b=1;
        while(a<=10)
        {
            System.out.println(a+"\t");
            System.out.println("This is while loop.");
            a++;
        }
        do
        {
            System.out.println(b+"\t");
            System.out.println("This is do while loop.");
            b++;
        } while(b<=10);
        for(int c=1;c<=10;c++)
        {
            System.out.println(c+"\t");
            System.out.println("This the for loop");
        }
    }
}
