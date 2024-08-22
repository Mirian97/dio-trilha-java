public class App {
    public static void main(String[] args) throws Exception {
        byte age = 98;
        short year  = 2024;
        int cep = 2333884;
        long cpf = 723344555L;
        float pi = 3.14F;
        double salary = 6050.50;

        // exemplo com cast: normalNumber esta sendo explicitamente convertido para short antes de ser atribuido em shortNumber2
        short shortNumber1 = 1;
        int normalNumber = shortNumber1;
        short shortNumber2 = (short) normalNumber;
    }
}
