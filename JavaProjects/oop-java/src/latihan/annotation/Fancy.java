package latihan.annotation;

/**
 *  Annotation
 *      menambahkan metadata ke kode program yang kita buat (informasi tambahan)
 *      biasanya digunakan saat ingin membuat library / framework
 *      Annotation bisa diakses menggunakan Reflecsion
 *      kata kuncin untuk membuat annotation @inteface
 *      Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki value
 *
 *      attribut annotation
 *      ------------------------------------------------------------------------
 *      Attribute       |    Keterangan
 *      ------------------------------------------------------------------------
 *      @Target         |    memberitahu annotation bisa digunakan dimana saja
 *                      |    class/method/field/ yang lain
 *      -------------------------------------------------------------------------
 *      @Retention      |    memberitahu apakah annotation disimpan di hasil
 *                      |    Kompilasi, dan apakah bisa di baca oleh reflection
 *      -------------------------------------------------------------------------
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** click target/retentation untuk menegtahui apa saja yang bisa menjadi parameter  */
@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

public @interface Fancy {

    /** untuk menambahkan attribut seperti di bawah | default adalah nilai default */
    String nama();
    String[] tags() default {};

}
