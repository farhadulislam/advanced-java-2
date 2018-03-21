package dramaRating;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Platform {



    public static void main (String [] args){

        Platform platform1 = new Platform();
        platform1.showPlatform();

    }

    public void showPlatform(){

        System.out.println("Platform");
        System.out.println("Adding drama");
        Drama drama1 = new Drama(1, "Patriot");
        Drama drama2 = new Drama(2, "Mirror");
        Drama drama3 = new Drama(3, "Village");
        Drama drama4 = new Drama(4, "Postman");
        Drama drama5 = new Drama( Drama.getNumberOfDramas()+1, "Dual mind");
        Drama drama100 = new Drama(100, "XYZ");
        drama100.showCast();

        System.out.println("Adding drama records");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 350, 20, 500);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 350, 300, 700);
        DramaRecords dramaRecords3 = new DramaRecords(drama3, 400 , 380, 50000);
        DramaRecords dramaRecords4 = new DramaRecords(drama4, 300, 300, 50000);
        DramaRecords dramaRecords5 = new DramaRecords(drama5, 3500, 20, 5000);


        System.out.println("Adding Artist records");
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
        drama2.addCast(art1);
        drama2.addCast(art2);
        drama3.addCast(art1);
        drama3.addCast(art2);
        drama4.addCast(art1);
        drama4.addCast(art2);
        drama5.addCast(art1);
        drama5.addCast(art2);


        System.out.println("Now showing all artist from Artist classes");
        Artist.showAllArtist();

        System.out.println("Now showing all dramas from Drama classes");
        Drama.showAllDramas();

    }


}
