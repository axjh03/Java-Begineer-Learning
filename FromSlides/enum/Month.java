// Enum is a "CLASS" that represents a group of constants (unchangeable variables, like final variables).

// A class contains constructors that are invoked to create objects from the class blueprint.
// Constructor declarations look like method declarations—except that they use the name of the class and have no return type.
// A class can have more than one constructor.


public enum Month {January(1), February(2), March(3), April(4), 
                    May(5), June(6), July(7), August(8), September(9), 
                    October(10), November(11), December(12);

    private final int monthID;   // Field for the integer representing this month.

    
    //What does private final int mean?
    // private means that only the class can access the variable
    // final means that the variable cannot be changed
    // int means that the variable is an integer
    // monthID is the name of the variable

    // Constructor for setting the field

    private Month(int monthID){// Constructor should have same name as the class
        this.monthID = monthID; // this.monthID refers to the field
    }

    // Method that returns the associated month ID for a month

    //asInt() is just any other name
    // You can rename it to anything you want
    public int asInt(){ // asInt is the name of the method // It returns an integer
        return monthID;
    }

}