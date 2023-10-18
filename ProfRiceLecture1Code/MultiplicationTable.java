public class MultiplicationTable {
    public static void main(String[] args)
    {
        System.out.printf("%30sTimes 12 Table\n\n", " ");
        System.out.printf("     ");
        for(int x = 0; x<=12; ++x)
        {
            System.out.printf("%4d ", x);
        }

        System.out.printf("\n     ");
        for(int x = 0; x<=12; ++x)
        {
            System.out.print("---- ");
        }

        for(int y = 0; y<=12; ++y)
        {
            System.out.printf("\n%2d | ", y);
            for(int x = 0; x<=12; ++x)
            {
                System.out.printf("%4d ", x*y);
            }
        }

    }
}
