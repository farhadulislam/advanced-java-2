package dramaRating;

import java.util.LinkedHashSet;
import java.util.Set;

public class Platform {

    public static void main (String [] args){

        Platform platform1 = new Platform();
        platform1.showPlatform();

    }

    public void showPlatform(){

        System.out.println("Platform");
        Drama drama1 = new Drama(1, "Patriot");
        Drama drama2 = new Drama(2, "Mirror");
        Drama drama3 = new Drama(3, "Village");
        Drama drama4 = new Drama(4, "Postman");
        Artist art1 = new Artist("Afran", "Nisho");
        Artist art2 = new Artist("Apurbo");
        Artist art3 = new Artist("Mehzabien", "Chowdhury");
        Artist art4 = new Artist("Shabnam", "Faria");
        Artist art5 = new Artist( "Tisha");
        Staff afran = art1;
        art1.addDramaToArtistsRecords(drama1);
        art1.showDramasWorkedOn();
        Set<Artist> artistList = new LinkedHashSet<Artist>();
        artistList.add(art1);
        artistList.add(art2);
        artistList.add(art3);
        artistList.add(art4);
        artistList.add(art5);
        System.out.println(artistList);

    }
}
