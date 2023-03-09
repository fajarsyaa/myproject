package latihan.aplication;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *  Try with Resource
 *          sebuah mekanisme agar kita lebih mudah menggunakan resource(sesuatu yang setelah digunakan harus di close)
 *          jika menggunakan ini harus menggunakan interface SutoCloseable
 */
public class ReadApp {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("Readme.md"))){
            while (true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable err){
            System.out.println("error membaca file :" +err.getMessage());
        }
    }
}
