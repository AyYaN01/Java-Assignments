public class Classes 
{
    public static void main(String[] args) 
    {
        Human h1=new Human();
        Human h2=new Human();
        h1.weight=80;
        h2.weight=75;
        h1.height=180;
        h2.height=185;
        h1.running();
        h2.eating();
        System.out.println("Human 1's weight is: "+h1.weight+"\t and height is: "+h1.height);
        System.out.println("Human 2's weight is: "+h2.weight+"\t and height is: "+h2.height);
    }
}
class Human
{
    int weight;
    int height;
    void running()
    {
        System.out.println("This is running method.");
    }
    void eating()
    {
        System.out.println("This is eating method.");
    }
}