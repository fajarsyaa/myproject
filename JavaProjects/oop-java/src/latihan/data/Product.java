package latihan.data;

import java.util.Objects;

public class Product {

    public String merk;
    public Integer harga;
    public Product(String merk, Integer harga){
        this.merk = merk;
        this.harga = harga;
    }

    /**
     *  Override method di Class Obeject / class bawaan java
     *
     *  toString(), digunakan untuk mempresentasikan object dalam bentuk string
     *              secara default menghasilkan output:  namaClass+@+hasCode
     */
    public String toString() {
        return "Product name : "+this.merk+", price : "+this.harga;
    }

    /**
     *  Override method di Class Obeject / class bawaan java
     *
     *  equals(), untuk membandingkan apakah object benar-benar sama di memory atau beda
     *            secara default ini membandingkan dari memory, menggunakan perbangdingan (==)
     *
     *  hashCode(), kebalikan dari toString
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!Objects.equals(merk, product.merk)) return false;
        return Objects.equals(harga, product.harga);
    }

    @Override
    public int hashCode() {
        int result = merk != null ? merk.hashCode() : 0;
        result = 31 * result + (harga != null ? harga.hashCode() : 0);
        return result;
    }
}
