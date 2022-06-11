public class MthdRtrnRefObj
{
    public static void main(String[] args) 
    {
        Demo obj1=new Demo(69);
        Demo obj2;
        obj2 = obj1.IncBy100();
        System.out.println("OBJECT 1 a= "+obj1.a+"\nOBJECT 2 a= "+obj2.a);
    }
}
class Demo
{
    int a;
    Demo(int x)
    {
        a=x;
    }
    Demo IncBy100()
    {
        Demo temp=new Demo(a+100);
        return temp;
    }
}