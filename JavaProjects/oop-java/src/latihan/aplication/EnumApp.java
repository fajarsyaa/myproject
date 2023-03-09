package latihan.aplication;

import latihan.data.Level;
import latihan.enumClass.Customer;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setNama("Fajar");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getNama());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        // konversi enum ke string
        String levelString = Level.VIP.name();
        System.out.println(levelString);

        // konversi string ke enum
        Level level = Level.valueOf("STANDART");
        System.out.println(level);

        // list level
        System.out.println("list level");
        for (var value: Level.values()) {
            System.out.println(value);
        }

    }
}
