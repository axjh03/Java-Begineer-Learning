enum Name { Aalok("Jha"), Raghav("Shrishrimal"), Shubham("Jha"), 
            Rupesh("Jha"), Rupak("Sharma"), Akshay("Kumar");

            // enum can't have two same variables

            
    private final String lastName;  // Field for the lastName of the person.

    //Constructor 
    // Or the blueprint of the object
    private Name(String lastName){
        this.lastName = lastName;
    }

    public String lastNameReturner(){ // Function that returns the lastName of the person 
        // Function name can be anything
        return lastName;
    }
 
}
