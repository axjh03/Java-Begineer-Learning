public class report {

  public static void main(String[] args){
    
    for(GpaAndLetterGrade g : GpaAndLetterGrade.values()) {
      System.out.printf("Name : %s\nLetter Grade: %s\nGPA: %.1f\n\n", 
                        g, g.letterGradeReturner(), g.gpaReturner());
    }

  }

}
