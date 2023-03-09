public class MethodVariableArgument {
    public static void main(String[] args) {

        System.out.println("pengunaan array");
        int[] nilai = {89,56,56,77};
        sayCongrats("ALEXANDER",nilai);
        System.out.println("-----------------------------------------------------------");
        System.out.println("pengunaan variable argumen + array");
        int[] nilai2 = {89,56,56,77};
        saySuccess("MODRIC",nilai2);
        System.out.println("pengunaan variable argumen, langsung");
        saySuccess("FAJAR",89,90,88,98);


    }

//    menggunakan parameter array
    public static void sayCongrats(String nama, int[] nilaiUn){
        int total = 0;
        for (int nilai : nilaiUn ) {
            total += nilai;
        }
        var finalNilai = total / nilaiUn.length;
        if (finalNilai >= 75){
            System.out.println("SELAMAT "+nama+" ANDA DI NYATAKAN LULUS, DENGAN NILAI RATA-RATA "+finalNilai);
        }else{
            System.out.println("MAAF "+nama+" ANDA DI NYATAKAN TIDAK LULUS, DIKARENAKAN NILAI RATA-RATA "+finalNilai);
        }
    }

//    menggunakan variable argument
    public static void saySuccess(String nama, int... nilaiUn){
        int total = 0;
        for (int nilai : nilaiUn ) {
            total += nilai;
        }
        var finalNilai = total / nilaiUn.length;
        if (finalNilai >= 75){
            System.out.println("SELAMAT "+nama+" ANDA DI NYATAKAN LULUS, DENGAN NILAI RATA-RATA "+finalNilai);
        }else{
            System.out.println("MAAF "+nama+" ANDA DI NYATAKAN TIDAK LULUS, DIKARENAKAN NILAI RATA-RATA "+finalNilai);
        }
    }
}
