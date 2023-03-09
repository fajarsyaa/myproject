import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {
    public static void main(String[] args) {

        List<Integer> arrL = new ArrayList<>();

        List<Integer> newList = List.of(7,8,9);

        arrL.add(1);
        arrL.add(2);
        System.out.println(arrL);

        arrL.add(0,3);
        arrL.add(1,4);
        System.out.println(arrL);

        arrL.addAll(newList);
        arrL.re
        arrL.set(0,8);
        System.out.println(arrL);

    }
}
