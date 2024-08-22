public class FullName {

    public static void main(String[] args){
        String firstName = "Mirian";
        String lastName = "Quispe";

        String fullName = getFullName(firstName, lastName);
        System.out.print(fullName);
    }

    public static String getFullName(String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);
    }
}
