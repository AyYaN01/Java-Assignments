public class PassByRef
{
    public static void main(String[] args) 
    {
        PBref obj=new PBref();
        obj.x=42;
        obj.y=59;
        System.out.println("Before Swap \nA= "+obj.x+"\nB= "+obj.y);
        obj.swap(obj);
        System.out.println("After Swap \nA= "+obj.x+"\nB= "+obj.y);
    }
}
class PBref
{
    int x,y;
    void swap(PBref o)
    {
        int temp;
        temp=o.x;
        o.x=o.y;
        o.y=temp;
    }
}