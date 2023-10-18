public class LastName {
    public static void main(String[] args){
        for(Name n : Name.values()){
            System.out.println("FirstName = "+n+ " LastName = " + n.lastNameReturner());
        }
    }
}
