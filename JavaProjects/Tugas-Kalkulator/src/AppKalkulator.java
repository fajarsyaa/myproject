import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppKalkulator {
    public static void main(String[] args) {
        System.out.println("====== Aplikasi Kalkulator Sederhana ======\n");
        System.out.println("pilih operasi yang anda inginkan : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa bagi / modulus\n");
        System.out.print("Masukkan angka sesuai menu yang anda inginkan : ");

        Scanner input = new Scanner(System.in);
        int pilihanUser = input.nextInt();

        System.out.print("masukkan angka ke-1 : ");
        int first = input.nextInt();
        System.out.print("masukkan angka ke-2 : ");
        int second = input.nextInt();

        switch (pilihanUser){
            case 1 :
                int hasil1 = first + second;
                System.out.println("Penjumlahan dari "+first+" + "+second+" = "+hasil1);
                resultFileWriter("Penjumlahan dari "+first+" + "+second+" = "+hasil1);
                break;
            case 2 :
                int hasil2 = first - second;
                System.out.println("Pengurangan dari "+first+" - "+second+" = "+hasil2);
                resultFileWriter("Pengurangan dari "+first+" - "+second+" = "+hasil2);
                break;
            case 3 :
                int hasil3 = first * second;
                System.out.println("Perkalian dari "+first+" X "+second+" = "+hasil3);
                resultFileWriter("Perkalian dari "+first+" X "+second+" = "+hasil3);
                break;
            case 4 :
                int hasil4 = first / second;
                System.out.println("Pembagian dari "+first+" : "+second+" = "+hasil4);
                resultFileWriter("Pembagian dari "+first+" : "+second+" = "+hasil4);
                break;
            case 5 :
                int hasil5 = first % second;
                System.out.println("Modulus dari "+first+" % "+second+" = "+hasil5);
                resultFileWriter("Modulus dari "+first+" % "+second+" = "+hasil5);
                break;
            default:
                System.out.println("Pilihan anda salah, masukkan ( 1-5 )");
                break;
        }
    }


    static void resultFileWriter(String artikel) {
        try {
            FileWriter writeFile = new FileWriter("result.txt");
            System.out.println("created file result.txt");
            writeFile.write(artikel);
            writeFile.close();
        }catch (IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }

}
