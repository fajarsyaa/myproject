import java.util.Arrays;
public class SortAndSearch {
    public static void main(String[] args) {
        int array[] = {8,7,9,1,2,3,5,4,6,10};

        /**
         * Sort => digunakan untuk mengsortir/pengurutan array dengan ascending
         */
        Arrays.sort(array);

        for (int i=0; i < array.length;i++){
            System.out.print(array[i]);
        }

        /**
         * binnarySearch => digunakan untuk mencari posisi index di array
         * @params data array
         * @params data yang ingin di cari
         */
        int index = Arrays.binarySearch(array,3);

        if (index >= 0){
            System.out.println("\nelemen 3 di temukan di " + index);
        }

        String buah[] = {"mangga","melon","apel","jambu","nanas","semangka"};
        int buahIndex = Arrays.binarySearch(buah,"jambu");
        System.out.println(buahIndex);

    }
}
