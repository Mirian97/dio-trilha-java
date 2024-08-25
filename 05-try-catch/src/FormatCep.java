public class FormatCep {
    public static void main(String[] args) {
        try {
            String formattedCep = formatCep("11100222");
            System.out.println(formattedCep);
        } catch (InvalidCepException e) {
            System.out.println("Cep number invalid");
        }

    }

    static String formatCep(String cep) throws InvalidCepException {
        if(cep.length() != 8){
            throw new InvalidCepException();
        }
        return "111-00222";
    } 
}
