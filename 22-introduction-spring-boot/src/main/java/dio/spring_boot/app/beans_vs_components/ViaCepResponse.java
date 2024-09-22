package dio.spring_boot.app.beans_vs_components;

public class ViaCepResponse {
    private String cep;
    private String street;
    private String location;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Via Cep Response {" +
                "cep='" + cep + '\'' +
                ", street='" + street + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
