// In this example I will show that a thread might execute in any order
public class A implements Runnable{

    @Override // Must Override the run() method in the Runnable interface
    public void run()
    {
        System.out.println("A");
    }
    
}
