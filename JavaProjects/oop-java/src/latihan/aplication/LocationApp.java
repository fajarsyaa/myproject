package latihan.aplication;

import latihan.data.Country;
import latihan.data.Location;

public class LocationApp {
    public static void main(String[] args) {

//        var Location = new Location();    // error karena class abstract

        var country = new Country();
        country.namaTempat = "INDONESIA";
        country.inHere();
        System.out.println(country.namaTempat);

        // teknik polymorpishme
        Location location = new Country();
        location.namaTempat = "QATAR";
        location.inHere();
        System.out.println(location.namaTempat);

    }
}
