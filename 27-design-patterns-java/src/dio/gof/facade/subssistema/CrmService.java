package dio.gof.facade.subssistema;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void storeCustomer(String name, String cep, String city, String state){
        System.out.println("Customer stored in CRM system");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }
}
