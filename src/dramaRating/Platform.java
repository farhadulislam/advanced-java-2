package dramaRating;

import java.util.*;

public class Platform {

    private static TreeMap<String, Double> treeValue = new TreeMap<>();

    public static void main (String [] args){

        System.out.println("STARTING main method from Platform class");
        System.out.println("STARTING main method from Platform class");

        quickStart();

       /* Platform platform1 = new Platform();
        platform1.addRecords();
        platform1.showPlatform();
        platform1.doRanking();*/

        System.out.println();

    }

    public void addRecords(){

        System.out.println("Platform initiated");
        System.out.println("Adding drama ...........");
        Drama drama1 = new Drama(Drama.issueDramaId(), "Patriot");
        Drama drama2 = new Drama(2, "Mirror");
        Drama drama3 = new Drama(3, "Village");
        Drama drama4 = new Drama(4, "Postman");
        Drama drama5 = new Drama(5, "Dual mind");
        Drama drama6 = new Drama (6, "Beautiful mind");
        Drama drama7 = new Drama (7, "Press");
        Drama drama8 = new Drama (Drama.issueDramaId(), "Rainbow");


        System.out.println("Adding drama records...........");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 350, 20, 500);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 350, 300, 700);
        DramaRecords dramaRecords3 = new DramaRecords(drama3, 400 , 380, 50000);
        DramaRecords dramaRecords4 = new DramaRecords(drama4, 3000, 300, 800000);
        DramaRecords dramaRecords5 = new DramaRecords(drama5, 3500, 20, 5000);
        DramaRecords dramaRecords6 = new DramaRecords(drama6, 3500, 2, 50345);
        DramaRecords dramaRecords7 = new DramaRecords(drama7, 100, 50 , 200);
        DramaRecords dramaRecords8 = new DramaRecords(drama8, 20000, 22, 21000);


        System.out.println("Adding Artist records.............");
        Artist afranNisho = new Artist("Afran", "Nisho");
        Artist art3 = new Artist("Apurbo");
        Artist art5 = Artist.createArtist("Allen", "Shuvro");
        Artist art7 = new Artist("Farhan Ahmed", "Zovan" );
        Artist art9 = Artist.createArtist("Nayeem");
        Artist art11 = new Artist("Sajal");


        Artist art2 = new Artist("Mehzabien", "Chowdhury");
        Artist art4 = new Artist("Sabnam", "Faria");
        Artist art6 = new Artist( "Tisha", "Nusrat Imrose");
        Artist art8 = Artist.createArtist("Sabila", "Noor");
        Artist art10 = new Artist("Aparna", "Ghosh");
        Artist art12 = new Artist("Tasnuva", "Tisha");
        Artist art14 = new Artist ("Safa", "Kabir");
        Artist art16 = new Artist ("Mousumi", "Hamid");
        Artist art18 = new Artist("Shokh");
        Artist art200 = Artist.autoCreateArtist();




        drama1.addCast(afranNisho);
        drama1.addCast(art10);
        drama2.addCast(afranNisho);
        drama2.addCast(art2);
        drama3.addCast(art4);
        drama3.addCast(art2);
        drama4.addCast(art7);
        drama4.addCast(art5);
        drama5.addCast(art7);
        drama5.addCast(art11);
        drama6.addCast(art4);
        drama7.addCast(afranNisho);
        drama7.addCast(art6);

    }
    public void showPlatform(){

        System.out.println("------------------------------------------");
        System.out.println("Now showing all artist from Artist classes");
        Artist.showAllArtist();
        System.out.println("**************************************");

        System.out.println("Now showing all dramas from Drama classes");
        Drama.showAllDramas();
        System.out.println("**************************************");
    }

    public void doRanking(){

        System.out.println("-------------Ranking in DESCECENDING order--------------------------------------");

        for(DramaRecords dramaRecords: DramaRecords.getAllDramaRecords()){

            treeValue.put(dramaRecords.getDrama().getDramaName(), dramaRecords.rank1A());
            //treeValue.clear();
            //treeValue.put(dramaRecords.getDrama().getDramaName(), dramaRecords.rank1());

        }


        Map sortedMap = sortByValues(treeValue);

       // Ranking.showMap(sortedMap);

        // Get a set of the entries on the sorted map
        Set set = sortedMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }

    public static <K, V extends Comparable<V>> Map<K, V>
    sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =
                new Comparator<K>() {
                    public int compare(K k1, K k2) {
                        int compare =
                                map.get(k1).compareTo(map.get(k2));
                        if (compare == 0)
                            return 1;
                        else
                            return compare;
                    }
                };

        Map<K, V> sortedByValues =
                new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    private static void quickStart(){

        System.out.println("QUICKSTART method.......");
        Platform platform1 = new Platform();
        platform1.addRecords();
        platform1.showPlatform();
        platform1.doRanking();
    }


}
