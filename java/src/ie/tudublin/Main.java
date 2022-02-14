package ie.tudublin;

public class Main
{
    public static void BugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }

    public static void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }

    public static void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }

    public void cat()
    {
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");

        lucy = misty;
        misty.setName("Tara");

        System.out.println(misty);
        System.out.println(lucy);

        
        Cat cat = new Cat("Ginger");

        while(cat.getNumLives() > 0)
        {
            cat.kill();
        }
        cat.kill();

    }
    public static void main(String[] args)
    {
<<<<<<< HEAD
<<<<<<< HEAD
        BugZap();
=======
        bugZap();
>>>>>>> 32791f4ad6e914917f1724d84f8fb44506699232
=======
        loops();
>>>>>>> c1dcd3b3d001efcb20626a40a7855df7e74ce3f0

        // Tara Misty
        // Tara Tara
        
    }
}