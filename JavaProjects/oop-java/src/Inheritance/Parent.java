package Inheritance;

class Parent {
    String nama;
    void doIt(){
        System.out.println("do it in parent");
    }
}
class Child extends Parent{
    String nama;
    void doIt(){
        System.out.println("do it in child");

        /**
         * Variable hiding
         * masalah yang muncul karena ada nama field yang sama di child class dan Parent class
         * untuk mengatasinya bisa menggunakan keyword super
         */
        System.out.println("Parent name is "+super.nama);
    }
 }