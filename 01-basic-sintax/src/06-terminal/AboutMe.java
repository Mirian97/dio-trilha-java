public class AboutMe {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo "+ firstName + " "+ lastName);
        System.out.println("Tennho " + age + " anos");
        System.out.println("Tenho altura de: " + height);
    }
}
