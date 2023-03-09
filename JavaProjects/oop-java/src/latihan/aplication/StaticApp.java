package latihan.aplication;

import static latihan.latihanStatic.Application.*;
import latihan.latihanStatic.Constant;
import latihan.latihanStatic.Country;
import latihan.latihanStatic.MathUtil;


/**
 * Static keyword
 * dengan kata kunci static, kita bisa membuat field,method atau class bisa di akses langsung tanpa
 * melalui objectnya.
 *
 *
 * static dapat digunakan di :
 *      -Field, atau disebut class variable, artinya field tersebut dapat di akses langsung tanpa membuat
 *          object-nya terlebih dahulu.
 *      -Method, atau disebut class method, artinya method tersebut dapat di akses langsung tanpa membuat
 *          object-nya terlebih dahulu.
 *      -Inner class, artinya inner class tersebut bisa di akses secara langsung tanpa harus membuat object
 *          outer class-nya terlebih dahulu.
 *          Static pada inner class akan memyebabkan kita tidak bisa  mengakses lagi object outer classnya.
 *          atau antara class inner dan outer seolah-olah sudah tidak saling berhubungan.
 *      -Block, static block akan otomatis di eksekusi ketika sebuah class di load.
 *
 *
 * @note semua prakter percobaan di atas ada di file latihanStatic
 *
 * import static, agar tidak menuliskan nama class
 * @use import static latihan.latihanStatic.Application.*;  ambil semua
 * @use import static latihan.latihanStatic.Application.PROCESSORS; ambil spesifik
 */


public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,2,3));

        Country.City city = new Country.City();
        city.setNama("Mojokerto");
        System.out.println(city.getNama());

        System.out.println(PROCESSORS);
    }
}
