public class Date {
    public static void main(String[] args){
        for(Month m : Month.values()){
            System.out.println(m + "("+ m.asInt() +")");
        }
    }
}
