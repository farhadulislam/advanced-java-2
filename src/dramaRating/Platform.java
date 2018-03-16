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

        art1.addDramaToArtistsRecords(drama1);
        art1.showDramasWorkedOn();


        Set<Artist> setOfArtist = new LinkedHashSet<Artist>();
        setOfArtist.add(art1);
        setOfArtist.add(art2);
        setOfArtist.add(art3);
        setOfArtist.add(art4);
        setOfArtist.add(art5);
        System.out.println(setOfArtist);

    }
}
