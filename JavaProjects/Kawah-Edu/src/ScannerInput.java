import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.print("Masukkan jumlah index array = ");
        int index = input.nextInt();

        List newArray = new ArrayList<>();

        for (int i = 0; i < index; i++ ){
            System.out.print("masukkan data index - "+i+" = ");
            var data = input.nextInt();
            newArray.add(data);
        }

        System.out.println(newArray);
    }
}
