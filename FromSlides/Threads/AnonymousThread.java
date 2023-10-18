public class AnonymousThread {
    public static void count()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Thread Count : " + i);
        }
    }

    public static void main(String[] args)
    {
        // Format : ().start
        (
            new Thread
            (
                new Runnable(){
                    @Override
                    public void run()
                    {
                        count();
                    }
                }
            )
        ).start();

        // Main count
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Main Count : " + i);
        }
    }
}
