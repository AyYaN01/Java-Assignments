public class Constructor 
{
    public static void main(String[] args) 
    {
        Missile mis1=new Missile(1500.50,2400.69,24.5,250);
        Missile mis2=new Missile(65000.0);
        Missile mis3=new Missile(265);
        Missile mis4=new Missile(2546.45,60.8);
        System.out.println("Missile 1 has: "+mis1.velocity+"\t"+mis1.yield+"\t"+mis1.killradius+"\t"+mis1.enrichment);
        System.out.println("Missile 1 has: "+mis2.velocity+"\t"+mis2.yield+"\t"+mis2.killradius+"\t"+mis2.enrichment);
        System.out.println("Missile 1 has: "+mis3.velocity+"\t"+mis3.yield+"\t"+mis3.killradius+"\t"+mis3.enrichment);
        System.out.println("Missile 1 has: "+mis4.velocity+"\t"+mis4.yield+"\t"+mis4.killradius+"\t"+mis4.enrichment);
    }
}
class Missile
{
    double velocity;
    double yield;
    double killradius;
    int enrichment;
    Missile(double a, double b, double c,int e)
    {
        velocity=a;
        yield=b;
        killradius=c;
        enrichment=e;
    }
    Missile(double d)
    {
        yield=d;
    }
    Missile(int f)
    {
        enrichment=f;
    }
    Missile(double g,double h)
    {
        velocity=g;
        killradius=h;
    }
}