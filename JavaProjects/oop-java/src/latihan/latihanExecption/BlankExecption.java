package latihan.latihanExecption;

/**
 *  Runtime Exception
 *          Exception yang tidak wajib ditangkap dengan try catch
 *          saat membuatnya harus extends class RuntimeException
 */

public class BlankExecption extends RuntimeException{
    public BlankExecption(String message){
        super(message); // memanfaatkan constructor, class bawaan java RuntimeException
    }
}
