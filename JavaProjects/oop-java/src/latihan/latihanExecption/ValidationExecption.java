package latihan.latihanExecption;

/**
 *   Checked Exception
 *          Exception yang di wajibkan ditangkap dengan try catch
 */
public class ValidationExecption extends Throwable{
    public ValidationExecption(String message){
        super(message);  // memanfaatkan constructor, class bawaan java Throwable
    }
}
