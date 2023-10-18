// Implementation of Runnable interface
public class ThreadExample implements Runnable{

    @Override // Must Override the run() method in the Runnable interface
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Thread Continues : " + i);
        }
    }

    // The above run() method will be executed by the thread and is the only one method in the Runnable interface

    public static void main(String[] agrs)
    {
        ThreadExample te = new ThreadExample();
        Thread t = new Thread(te); // Create a new thread
        // The above code creates a new thread for te and the thread will execute the run() method in te
        t.start(); // Start the thread

        // The same function but for MAIN.. not a thread
        for(int i = 0; i < 10; i++)
        {
            System.out.println("MAIN Continues : " + i);
        }
        ThreadExample te2 = new ThreadExample();
        Thread t2 = new Thread(te2); // Create a new thread
        t2.start(); // Start the thread

        // A thread might start at any time, even before the current thread finishes its tasks
        // The order of the output is not guaranteed
    }
}