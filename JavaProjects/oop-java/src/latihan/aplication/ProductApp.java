package latihan.aplication;

import latihan.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("ASUS ROG",20000000);
        System.out.println(product.merk);
        System.out.println(product.harga);
        System.out.println(product); // ditambahkan .toString secara defaut
        System.out.println(product.toString());

        Product product2 = new Product("ASUS ROG",20000000);

        // ini true karena udah di override method equalsnya di Product.java
        System.out.println(product.equals(product2));

        System.out.println(product.hashCode() == product2.hashCode());
    }
}
