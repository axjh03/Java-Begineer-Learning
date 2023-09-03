public class ReturnFunction {
    public static double CalcTotalMealPrice(double tipRate, double listedPrice, double taxRate){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = tip + tax + listedPrice;
        //System.out.println("Your Total cost will be : " + result);
        return result;
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args){
        double Total = CalcTotalMealPrice(1.5, 13.99, 0.2 );
        print("This is your total : "+Total);
    }
}
