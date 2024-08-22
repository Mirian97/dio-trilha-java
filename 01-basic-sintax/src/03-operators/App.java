public class App {
    public static void main(String[] args) throws Exception {
        int number1 = 8;
        // realizou a subtração e logo imprimiu o valor
        System.out.print(--number1);

        int number2 = 15;
        // imprimiu o valor e depois somou
        System.out.print(number2++);

        boolean variavel = true;
        // atribuição de valor a uma variavel
        variavel = !variavel;
        System.out.print(variavel);
    }
}
