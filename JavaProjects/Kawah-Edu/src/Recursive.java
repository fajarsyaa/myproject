public class Recursive {
    public static void main(String[] args) {
        System.out.println("recursive java");
        int sum = sum(10);
        System.out.println(sum);
    }
    public static int sum(int nilai){
        if (nilai > 0){
            return nilai + sum(nilai -1);
        }else{
            return 0;
        }
    }
}
