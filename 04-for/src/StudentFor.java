public class StudentFor {
    public static void main(String[] args) {
        String students [] = {"FELIPE", "JOÃO", "MARIA", "MIRIAN"};

        // For Tradicional
        for(int x=0; x< students.length; x++){
            System.out.println("The index x=" + x + " and the student is " + students[x]);
        }

        // For Each 
        for(String student: students)
            System.out.println("The current student is: " + student);
    }
}
