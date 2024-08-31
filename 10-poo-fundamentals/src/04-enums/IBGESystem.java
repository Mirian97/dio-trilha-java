public class IBGESystem {
    public static void main(String[] args) {
        for(BrazilianState e: BrazilianState.values()){
            System.out.println(e.getSigla() + " - " + e.getName());
        }

        BrazilianState bahia = BrazilianState.BAHIA;
        System.out.println(bahia.getName());
        System.out.println(bahia.getIbge());
        System.out.println(bahia.getUpperCaseName());
    }
}
