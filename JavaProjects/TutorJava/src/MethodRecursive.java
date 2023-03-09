import java.io.IOException;

public class MethodRecursive {
    public static void main(String[] args) {
        int faktorial = faktorialRecusive(10);
        System.out.println(faktorial);
    }

//    method yang memanggil dirinya sendiri
    public static int faktorialRecusive(int nilai){
        if (nilai == 1){
            return 1;
        }else{
            return nilai * faktorialRecusive(nilai-1);
        }
    }
}
