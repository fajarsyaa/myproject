package latihan.data;

/**
 * karena ini merupakan turunan dari implements, maka harus override semua method yang ada di parent
 */
public class Avanza implements Car{
    public void drive() {
        System.out.println("drive in avanza");
    }
    public int getTire() {
        return 4;
    }
    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
