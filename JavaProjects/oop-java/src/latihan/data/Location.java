package latihan.data;

/**
 * Abstract class, class yang tidak bisa dibuat obect secara langsung / tidak bisa di instansiasi langsung
 *                  hanya bisa di turunkan, dan class turunannya yang bisa di instansiasi
 */
public abstract class Location {
    public String namaTempat;

    /**
     * abstract method, saat membuat abstract method tidak boleh menulis block method tersebut ! {},
     *                  saat ada method abstract, maka class child harus membuat oveeride method tersebut,
     *                  dan tidak boleh memiliki access modifier private
     */
    public abstract void inHere();

}
