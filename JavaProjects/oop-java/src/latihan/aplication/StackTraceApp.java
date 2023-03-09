package latihan.aplication;


/**
 *  StackTraceElement Class
 *      Throwable memiliki method yang bernama getStackTrace(), dimana ini menghasilkan Array dari object  StackTraceElement.
 *
 *      StackTraceElement berisikan informasi tentang class, file, method bahkan baris dimana terjadinya error
 *      cara penggunaan paling mudah dengan menggunakan printStackTrace()
 */

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {"fajar","dahlan","yusron"};
            System.out.println(names[100]);
        }catch (Throwable err){
            // cara 1 + looping manual
            StackTraceElement[] stackTraceElements = err.getStackTrace();

            // cara 2 + otomastis
            err.printStackTrace();
        }

        // multiple stactTrace
        System.out.println("multiple stactTrace, untuk mencari lebih detail");
        try {
            sampleError();
        }catch (RuntimeException err){
            err.printStackTrace();
        }

    }

    public static void sampleError(){
        try {
            String[] names = {"fajar","dahlan","yusron"};
            System.out.println(names[100]);
        }catch (Throwable err){
            throw new RuntimeException(err);
        }
    }
}
