public class functionWithParameters {

    public static void CalcTotalMealPrice(double tipRate, double listedPrice, double taxRate){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = tip + tax + listedPrice;
        System.out.println("Your Total cost will be : " + result);
    }
    public static void main(String[] args){
        CalcTotalMealPrice(3.4,2,4);
    }
}
