package dramaRating;

import java.util.Arrays;
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
        Drama drama5 = new Drama( Drama.getNumberOfDramas()+1, "Dual mind");

        Artist art1 = new Artist("Afran", "Nisho");
        Artist art3 = new Artist("Apurbo");
        Artist art5 = Artist.createArtist("Allen", "Shuvro");
        Artist art7 = new Artist("Farhan Ahmed", "Zovan" );
        Artist art9 = Artist.createArtist("Nayeem");

        Artist art2 = new Artist("Mehzabien", "Chowdhury");
        Artist art4 = new Artist("Sabnam", "Faria");
        Artist art6 = new Artist( "Tisha");
        Artist art8 = Artist.createArtist("Sabila", "Noor");
        Artist art10 = new Artist("Aparna", "Ghosh");
        Artist art11 = new Artist("Matt", "Damon");


        drama1.addCast(art1);
        drama1.addCast(art2);
        drama1.showCast();

      /*  art1.addDramaToArtistsRecords(drama1);
        art1.addDramaToArtistsRecords(drama4);
        art1.showDramasWorkedOn();


        //Set<Artist> setOfArtist = new LinkedHashSet<Artist>();

        /*Artist[] tempSet = {art1, art2, art3, art4, art5, art6, art7, art8, art9, art10, art11};

        System.out.println("Number of artist in records : " + tempSet.length);
        System.out.println("Last artist added on the record is " + tempSet[tempSet.length-1].toString());

        setOfArtist.addAll(Arrays.asList(tempSet));


        */

        System.out.println("Now showing all artist from Artist classes");
        Artist.showAllArtist();

    }


}
