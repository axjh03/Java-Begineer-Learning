public class AnonymousThread2 {

    public static void namePrinter(String name)
    {
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        (
            new Thread
            (
                new Runnable() {
                    @Override
                    public void run()
                    {
                        namePrinter("Aalok");
                    }
                }
            )
        ).start();
    }
}
