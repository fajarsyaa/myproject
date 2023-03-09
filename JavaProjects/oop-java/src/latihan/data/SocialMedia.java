package latihan.data;

class SocialMedia {
    String nama;

    /**
     * Final method, method final tidak bisa di override di class turunannya
     */

    final void login(String username){

    }
}

/**
 * Final class, class final tidak bisa diwariskan atau di rubah lagi
 *              jika sebuah di class di set menjadi final, maka seluruh turunannya akan otomatis error
 */
final class FaceBook extends SocialMedia{

//    ERROR
//    void login(String nama){
//
//    }

}

// ERROR
//class Messenger extends FaceBook{

//}