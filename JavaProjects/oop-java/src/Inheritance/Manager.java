package Inheritance;

class Manager extends Employe{

    /**
     * Super constractor
     * digunakan untuk mengakese constructor di parent
     * @syarat harus di akses di dalam cosntructor child
     *         jika constructor di parent ada parameternya maka constructor child harus mengaksesnya
     * @cara super()
     *       parameter tengantung dari constructor di parent
     */
    Manager(String nama){
        super(nama);
    }

    void sayHello(String nama){
        System.out.println("hi "+nama+", my name is "+this.nama+" I am a Manager");
    }
}
