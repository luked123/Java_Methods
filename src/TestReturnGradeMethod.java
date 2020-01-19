public class TestReturnGradeMethod {
    public static void main(String [] args){
        System.out.printf("The grade is %c\n", returnGrade(78.5));

        System.out.printf("The grade is %c\n", returnGrade(59.5));
    }

    public static char returnGrade(double score){
        if(score >= 90){
            return 'A';
        }
        else if(score >= 80.0){
            return 'B';
        }
        else if(score >= 70.0){
            return 'C';
        }
        else if(score >= 60.0){
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
