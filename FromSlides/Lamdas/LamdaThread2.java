public class LamdaThread2 {
    // Here we will not even implement count() function in this class.

    public static void main(String[] args)
    {
        (
            new Thread(
                () // Could be Runnable, we don't have to rite that
                -> // YES YES YES it can be in seperate line
                { // Here we are writing the body of the run() method, because anyways
                    // we are implementing Runnable interface.
                    // Before er just ran  count as run() we can just write run as count().
                    for (int i=0; i<3; i++)
                    {
                        System.out.println("tik tik : "+i);
                    }
                }
            )
        ).start();
    }
}
