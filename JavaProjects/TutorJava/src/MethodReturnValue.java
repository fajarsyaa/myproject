public class MethodReturnValue {
//    void adalah default untuk menthod yang tidak mengembalikan nilai
    public static void main(String[] args) {
        int rata = sum(12,13);
        System.out.println(rata);

        String name = "fajar";
        int age = 11;
        var check = checkDewasa(name,age);
        System.out.println(check);
    }
//    jika ingin mengembalikan nilai,
//    void harus di ganti dengan tipe data yang ingin dijadikan sebagai return value
    public static int sum(int first,int second){
        return first+second;
    }

    public static String checkDewasa(String name,int age){
        if (age < 17){
            return "MAAF " + name + " KAMU BELUM DEWASA, USIAMU SEKARANG " + age;
        }
        return "SELAMAT " + name + "KAMU SUDAH DEWASA, USIAMU SEKARANG " + age;
    }
}
