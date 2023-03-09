package latihan.data;


/**
 * Enum Class
 *    class yang berisi nilai terbatas yang sudah di tentukan nilainya
 *
 *    enum tidak bisa extend class lain, namun masih bisa implements interface
 *
 *    sama seperti class biasa enum class bisa menambahkan members(field, method, dan constructor)
 *    khusus constructor tidak bisa membuat public karena tujuan enum bukan untuk di instansiasi secara bebas
 *    saat membuat constructor harus memanggil  langsung constructornya di opsi enumnya,
 *    jika tidak cukup tulis opsinya saja
 */
public enum Level {

    // di bawah ini opsi enum
    STANDART("standart level"),
    PREMIUM("wow wow premium level"),
    VIP("yeay vip level");
    // end

    private String description;

    // tidak boleh di set public
    Level(String descrip){
        this.description = descrip;
    }


    public String getDescription(){
        return description;
    }


}
