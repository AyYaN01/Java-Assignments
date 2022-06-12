public class Inheritance
{
    public static void main(String args[])
    {
        A objA=new A();
        B objB=new B();
        objA.i=69;
        objA.j=42;
        objB.i=420;
        objB.j=550;
        objB.k=111;
        objA.show();
        objB.showk();
        int Ans1=objA.sum();
        int Ans2=objB.sumk();
        System.out.println("Ans A is= "+Ans1+"\nAns B is= "+Ans2);
    }
}
class A
{
    int i,j;
    void show()
    {
        System.out.println("i= "+i+"\tj="+j);
    }
    int sum()
    {
        return i+j;
    }
}
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("i= "+i+"\tj= "+j+"\tk= "+k);
    }
    int sumk()
    {
        return i+j+k;
    }
}