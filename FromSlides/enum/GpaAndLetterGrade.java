public enum GpaAndLetterGrade { Aalok("A", 3.9), Rupak("B", 3.6), Palak("C", 3.2), Anjali("B", 3.6);

    private final double gpa;
    private final String letterGrade;

    // String, double. // paramertes should be in same order as the enum.
    private GpaAndLetterGrade(String letterGrade, double gpa){
        this.gpa = gpa;
        this.letterGrade = letterGrade;
    }
    
    public double gpaReturner(){
        return gpa;
    }

    public String letterGradeReturner(){
        return letterGrade;
    }
}
