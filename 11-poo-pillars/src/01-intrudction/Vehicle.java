// Uma classe abstrata nao pode ser instanciada 
public abstract class Vehicle {
    // Encapsulamento
    private String plate;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }
    // Abstração
    // Quando um metodo se torna abstrato, quando uma classe extender esta, este metodo passara a ser obrigatorio
    // Remete ao polimorfismo, pois as classes filhas aplicarão este metodo a sua maneira
    public abstract void turnOn();
}