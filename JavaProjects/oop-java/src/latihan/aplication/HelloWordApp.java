package latihan.aplication;

import latihan.data.HelloWord;

public class HelloWordApp {
    /**
     * Anonymous class, class tanpa nama
     * adalah kemampuan mendeklarasikan sebuah class, sekaligus meng-instansiasi object-nya secara langsung
     *
     * sangat cocok ketika digunakan untuk membuat implementasi interface atau abstract class sederhana,
     * tanpa harus membuat implementasi classnya.
     *
     * kekurangan : tidak bisa di re-use
     */

    public static void main(String[] args) {

        HelloWord english = new HelloWord() {
            public void sayHello() {
                System.out.println("HELLO");
            }
            public void sayHello(String nama) {
                System.out.println("HELLO "+nama);
            }
        };

        HelloWord indonesia = new HelloWord() {
            public void sayHello() {
                System.out.println("HALO");
            }

            public void sayHello(String nama) {
                System.out.println("HALO "+nama);
            }
        };


        english.sayHello();
        english.sayHello("Fajar");
        indonesia.sayHello();
        indonesia.sayHello("Dahlan");

    }
}
