package dio.gof.facade;

import dio.gof.facade.subssistema.CepApi;
import dio.gof.facade.subssistema.CrmService;

public class Facade {
    public void migrateCustomer(String name, String cep){
        CepApi cepApi = CepApi.getInstance();
        String state = cepApi.getStateByCep(cep);
        String city = cepApi.getCityByCep(cep);

        CrmService.storeCustomer(name, cep, city, state);
    }
}
