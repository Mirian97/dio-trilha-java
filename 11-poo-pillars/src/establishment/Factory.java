package establishment;

import equipaments.multifunctional.MultifunctionalEquipament;
import equipaments.printer.Epson;
import equipaments.scanner.Wacon;

public class Factory {
    public static void main(String[] args) {
        System.out.println("EPSON");
        Epson epson = new Epson();
        epson.print();

        System.out.println("WACON");
        Wacon wacon = new Wacon();
        wacon.scan();

        System.out.println("Multifunctional Equipament");
        MultifunctionalEquipament mfEquipament = new MultifunctionalEquipament();
        mfEquipament.scan();
        mfEquipament.print();
    }
}
