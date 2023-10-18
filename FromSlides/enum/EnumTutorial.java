public class EnumTutorial {

  enum Status { 
    // the Status is a class here, it soundds weird but it is
    // Actually everything in java is a class.
    Running, Failed, Pending, Success; // all these are java
                                      //0      1        2        3
  }

  public static void main(String[] args) {

    int i = 5;  
    Status s = Status.Running; // object we assign to s;
    System.out.println(s); // it will print Running  
    System.out.println(s.ordinal()); // it will print the index of Running

    Status[] ss = Status.values(); // it will print all the values of Status
    for (Status a : ss) {
      System.out.println(a);
    }

  }

}