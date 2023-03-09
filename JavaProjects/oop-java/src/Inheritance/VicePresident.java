package Inheritance;

class VicePresident extends Manager{

    /**
     * Super constractor
     * digunakan untuk mengakese constructor di parent
     * @syarat harus di akses di dalam cosntructor child
     *         jika constructor di parent ada parameternya maka constructor child harus mengaksesnya
     */
    VicePresident(String nama){
        super(nama);
    }

    void sayHello(String nama){
        System.out.println("hi "+nama+", my name is "+this.nama+" I am a VP");
    }
}
