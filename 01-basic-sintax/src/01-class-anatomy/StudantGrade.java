public class StudantGrade {
    public static void main (String[] args){
        int grade = 10;

        if(grade < 6){
            System.out.print("REPPROVED");
        }else if (grade == 6){
            System.out.print("REVISION");
        } else{
            System.out.print("APPROVED");
        }
    }
}
