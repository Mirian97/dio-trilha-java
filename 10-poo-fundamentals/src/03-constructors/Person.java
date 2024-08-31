public class Person {
    String name;
    String cpf;
    String address;

    public Person(){}

    public Person(String name, String cpf){
        this.name = name;
        this.cpf= cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
