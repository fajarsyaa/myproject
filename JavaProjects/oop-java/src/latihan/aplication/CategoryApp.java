package latihan.aplication;

import latihan.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("ah-27hbc-jjd");
        category.setExpensive(true);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
