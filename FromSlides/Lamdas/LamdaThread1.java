public class LamdaThread1{
    public static void count()
    {
        for(int i = 0; i< 3; i++)
        {
            System.out.println("tik tik : "+i);
        }
    }

    public static void main(String[] args)
    {
        // Creating Anonymous Thread but using lamda
        (
            new Thread(
                // Now we don't write new Runnable(). We just use
                () -> count()
            )
        ).start();


        // // Creating Anonymous Thread but without using lamda
        // (
        //     new Thread(
        //         new Runnable()
        //         {
        //             @Override
        //             public void run(){
        //                 count();
        //             }
        //         }
        //     )
        // ).start();
    }

}