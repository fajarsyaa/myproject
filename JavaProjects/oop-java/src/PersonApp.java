public class PersonApp {
    public static void main(String[] args) {
        /**
         * object = instansiasi dari sebuah class
         * field / atribute / properti addalah data yang bisa kita sisipkan di dalam object
         * @cara tipe namaVariable = new ClassName()
         */

        var person = new Person();
        var person2 = new Person("Fajar","Mojokerto");
        var person3 = new Person("fajar");

        /**
         * akses dan Manipulasi field
         * caranya menggunakan . (titik)
         * untuk field final tidak bisa di ubah, hanya bisa kita panggil
         */

        person.nama = "Mukhamad Fajar Syaihu Walid";
        person.alamat = "Mojokerto";

        System.out.println(person.nama);
        System.out.println(person.alamat);
        System.out.println(person.country);

        /**
         *  akses method
         *  caranya menggunakan . (titik)
         * @cara object.namaMethod(params)
         */

        person.sayHello("Dahlan");


    }
}
