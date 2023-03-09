package Inheritance;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Fajar");
        manager.sayHello("Dahlan");

        var vp = new VicePresident("Dahlan");
        vp.sayHello("ipul");

        /**
         * Polymorphisme, perubahan bentuk
         */

        Employe employe = new Employe("Fajar");
        employe.sayHello("Dahlan");

        employe = new Manager("Dahlan");
        employe.sayHello("Yusron");

        employe = new VicePresident("Yusron");
        employe.sayHello("Irfan");

        /**
         * Method polymorphisme
         * @cara namaMethod(ParentClass parentclass){}
         *       harus class atasnya / yang paling atas, tidak bisa untuk childClass
         * @use  namaMethod(new class("") );
         */
        sayHai(new Employe("Agus"));
        sayHai(new Manager("Budi"));
        sayHai(new VicePresident("Bagas"));

    }

    static void sayHai(Employe employe){
        if (employe instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employe;
            System.out.println("Hai Vp, "+ vicePresident.nama);
        }else if (employe instanceof Manager){
            Manager manager = (Manager) employe;
            System.out.println("Hai Manager, "+manager.nama);
        }else {
            System.out.println("hello, "+employe.nama);
        }
    }
}

