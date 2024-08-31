package equipaments.multifunctional;

import equipaments.printer.Printer;
import equipaments.scanner.Scanner;

public class MultifunctionalEquipament implements Scanner, Printer{
    public void print() {
        System.out.println("Printing by multifunctional equipament");;
    }

    public void scan() {
        System.out.println("Scanning by multifunctional equipament");;
    }
}
