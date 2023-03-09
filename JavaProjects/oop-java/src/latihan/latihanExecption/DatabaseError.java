package latihan.latihanExecption;


/**
 *   Error exception
 *          Exception yang tidak disarankan ditangkap dengan try catch
 *          biasanya terjadi karena masalah serius, misal : gagal konek DB
 *          dan direkomendasikan untuk mematikan aplikasi
 */
public class DatabaseError extends Error{
    public DatabaseError(String message){
        super(message); // memanfaatkan constructor, class bawaan java Error
    }
}
