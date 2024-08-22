public class Relational {
    public static void main (String[] args){
        String name1 = "MIRIAN";
        String name2 = new String (name1);

        System.out.println(name1.equals(name2));
        // nao é a forma correta de comparar diferentes objetos
        System.out.println(name1 == name2);
    }
}
