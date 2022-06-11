public class PassByValue
{
    public static void main(String[] args) 
    {
        int a=42, b=59;
        PBvalue obj=new PBvalue();
        System.out.println("Before Swap \nA= "+a+"\n B= "+b);
        obj.swap(a,b);
        System.out.println("After Swap \nA= "+a+"\n B= "+b);
    }
}
class PBvalue
{
    void swap(int x, int y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;
    }
}