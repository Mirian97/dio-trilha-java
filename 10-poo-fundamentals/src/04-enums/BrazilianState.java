public enum BrazilianState {
    SAO_PAULO("SP", "São Paulo", 11),
    PIAUI("PI", "Piaui", 12),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 13),
    BAHIA("BH", "Bahia", 14),
    SANTA_CATARINA("SC", "Santa Catarina", 15)
    ;
    private String sigla;
    private String name;
    private int ibge;

    private BrazilianState(String sigla, String name, int ibge){
        this.ibge = ibge;
        this.name = name;
        this.sigla = sigla;
    }

    public int getIbge() {
        return ibge;
    }

    public String getName() {
        return name;
    }

    public String getSigla() {
        return sigla;
    }

    public String getUpperCaseName(){
        return this.name.toUpperCase();
    }
}
