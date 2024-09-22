package dio.gof.facade.subssistema;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getStateByCep(String cep){
        return "SP";
    }

    public String getCityByCep(String cep){
        return "Guarulhos";
    }
}
