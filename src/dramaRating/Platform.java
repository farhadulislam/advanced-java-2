package dramaRating;

import java.util.*;

import static otherStuff.GuessingGame.print;

public class Platform {

    private static TreeMap<String, Double> treeValue = new TreeMap<>();
    private static TreeMap<String, Double> treeValue2 = new TreeMap<>();


    public static void main (String [] args){

        System.out.println("STARTING main method from Platform class");

        //quickStart(); // This method invokes addRecords(), showPlatform() and doRanking() methods

       Platform platform1 = new Platform();
      // platform1.addRandomDummyRecords(10);
        //platform1.addRecords();
        platform1.addRecords2();
        platform1.showPlatform();
       // platform1.doRanking();
       platform1.doRanking2();



        System.out.println("EXECUTION ENDED");

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
        Drama drama9 = new Drama(Drama.issueDramaId(), "City life");
        Drama drama10 = new Drama(Drama.issueDramaId(), "Blue sky");


        System.out.println("Adding drama records...........");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 350, 20, 500);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 350, 300, 700);
        DramaRecords dramaRecords3 = new DramaRecords(drama3, 400 , 380, 50000);
        DramaRecords dramaRecords4 = new DramaRecords(drama4, 3000, 300, 800000);
        DramaRecords dramaRecords5 = new DramaRecords(drama5, 3500, 20, 5000);
        DramaRecords dramaRecords6 = new DramaRecords(drama6, 3500, 2, 50345);
        DramaRecords dramaRecords7 = new DramaRecords(drama7, 100, 50 , 200);
        DramaRecords dramaRecords8 = new DramaRecords(drama8, 20000, 22, 21000);
        DramaRecords dramaRecords9 = new DramaRecords(drama9);
        DramaRecords dramaRecords10 = new DramaRecords(drama10);

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

    public void addRecords2(){

        System.out.println("Adding Artist records.............");
        Artist afranNisho = new Artist("Afran", "Nisho");
        Artist apurbo = new Artist("Apurbo", "Ziaul Faruq");
        Artist allen = Artist.createArtist("Allen", "Shuvro");
        Artist zovan = new Artist("Farhan Ahmed", "Zovan" );
        Artist nayeem = Artist.createArtist("Nayeem");
        Artist sajal = new Artist("Sajal", "Abdullah");
        Artist tausif= new Artist("Tausif", "Mahbub");
        Artist zahidHassan = new Artist ("Zahid", "Hassan");
        Artist akmHassan = new Artist ("AKM", "Hassan");
        Artist mirSabbir = new Artist("Mir", "Sabbir");
        Artist mahfuz = new Artist("Mahfuz", "Ahmed");
        Artist partho = new Artist("Partho", "Barua");
        Artist intekhab = new Artist("Intekhab", "Dinar");
        Artist mosharraf = new Artist("Mosharraf", "Karim");
        Artist hassanMasud = new Artist("Hassan", "Masud");
        Artist salman = new Artist("Salman", "Muktadir");
        Artist lavlu = new Artist("Salahuddin", "Lavlu");
        Artist imran = new Artist("Imran");
        Artist dipakSumon = new Artist("Dipak", "Sumon");
        Artist siyam = new Artist("Siyam", "Ahmed");
        Artist allenShuvro = new Artist("Allen", "Shuvro");
        Artist fazlulBabu = new Artist("Fazlul Hoque", "Babu");
        Artist shatabdiWadud = new Artist ("Shatabdi", "Wadud");
        Artist ireshZaker = new Artist ("Iresh", "Zaker");
        Artist tariqAnamKhan = new Artist ("Tariq Anam", "Khan");
        Artist shahiduzzamanSelim = new Artist ("Shahiduzzaman", "Selim");
        Artist tahsan = new Artist ("Tahsan", "Khan");




        Artist mehzabien = new Artist("Mehzabien", "Chowdhury");
        Artist aparna = new Artist("Aparna", "Ghosh");
        Artist sabnam = new Artist("Sabnam", "Faria");
        Artist tasnuva = new Artist("Tasnuva", "Tisha");
        Artist tisha = new Artist( "Tisha", "Nusrat Imrose");
        Artist safa = new Artist ("Safa", "Kabir");
        Artist urmila = new Artist("Urmila", "Kaur");
        Artist sabila = Artist.createArtist("Sabila", "Noor");
        Artist mousumiHamid = new Artist ("Mousumi", "Hamid");
        Artist shokh = new Artist("Shokh","Anika Kabir");
        Artist nowshin = new Artist("Nowshin", "Nahrin");
        Artist momo = new Artist("Zakia", "Bari Momo");
        Artist farhanaMili = new Artist("Farhana", "Mili");
        Artist bindu = new Artist("Bindu", "Afsan ara");
        Artist toya = new Artist("Toya", "Mumtahina");
        Artist nabilaMasuma = new Artist("Nabila", "Masuma");
        Artist badhon = new Artist("Badhon", "Ajmeri Hoque");
        Artist neela = new Artist( "Neelanjona", "Neela");
        Artist nadia = new Artist ("Nadia", "Nayeem");
        Artist shahtaj = new Artist ("Shahtaj", "munira");
        Artist purnima = new Artist ("Purnima", "Dilara Hashem");
        Artist piaBipasha = new Artist ("Pia", "Bipasha");
        Artist vabna = new Artist ("Vabna");
        Artist snugdha = new Artist ("Snigdha", "Momin");
        Artist ajmeriAsha = new Artist ("Ajmeri", "Asha");
        Artist shanarei = new Artist ("Shanarei", "Shanu");
        Artist ishana = new Artist("Ishana", "mounita khan");
        Artist shoshi = new Artist ("Shoshi", " ...");
        Artist mithila = new Artist ("mithila", "Rashid");
        Artist dipannita = new Artist("Dipannita", "Martin");
        Artist sharlin = new Artist("Shalin", "Farzana");
        Artist sarika = new Artist("Sarika");
        Artist agnila = new Artist("Agnila");
        Artist bijori = new Artist("Bijori", "Barkatullah");
        Artist sanjidaPretty = new Artist ("Sanjida", "Pretty");
        Artist orsha = new Artist("Orsha");
        Artist bonne = new Artist ( "Bonne", "Hassan");
        Artist taniaBrishti = new Artist ("Tania", "brishti");
        Artist iffatTrisha = new Artist ("Iffat", "Trisha");
        Artist eloraGauhor= new Artist("Elora", "Gauhor");
        Artist mosumiHamid = new Artist("Mousumi", "Hamid");
        Artist salhaNadia = new Artist("Salha Khanom", "Nadia");
        Artist ohona = new Artist ("Ohona");
        Artist mariaNoor = new Artist ("Maria", "Noor");
        Artist neelanjonaNeela = new Artist ("Neelanjona", "Neela");





        /*******************/
        System.out.println("Adding Natok ...........");
        Drama drama1 = new Drama(Drama.issueDramaId(), "Tiar Khacha");
        Drama drama2 = new Drama (Drama.issueDramaId(), "Moharani");
        Drama drama3 = new Drama(Drama.issueDramaId(), "Boro Chele");
        Drama drama4 = new Drama(Drama.issueDramaId(), "Batch 27");
        Drama drama5 = new Drama(Drama.issueDramaId(), "Golden A+");
        Drama drama6 = new Drama(Drama.issueDramaId(), "Moyna o Mojnur Golpo");
        Drama drama7 = new Drama(Drama.issueDramaId(), "Se ache duare dariye");
        Drama drama8 = new Drama(Drama.issueDramaId(), "Forever");
        Drama drama9 = new Drama(Drama.issueDramaId(), "Megh Brishtir Alapon");
        Drama drama10 = new Drama(Drama.issueDramaId(), "Golpota Tomari");
        Drama drama11 = new Drama(Drama.issueDramaId(), "Bikel Belar Pakhi");
        Drama drama12 = new Drama(Drama.issueDramaId(), "Cafe 999");
        Drama drama13 = new Drama(Drama.issueDramaId(), "Ami Tomar Golpo Hobo");
       Drama drama14 = new Drama(Drama.issueDramaId(), "Shongshar");
        Drama drama15 = new Drama(Drama.issueDramaId(), "Manush");
       Drama drama16 = new Drama(Drama.issueDramaId(), "Kothopokothon");
       Drama drama17 = new Drama(Drama.issueDramaId(), "X Factor : Game Over");
       Drama drama18 = new Drama(Drama.issueDramaId(), "Khuji Tomay");
       Drama d19 = new Drama(Drama.issueDramaId(), "Ekhono Adhar");
        Drama d20 = new Drama(Drama.issueDramaId(), "Ekhon Onek Raat");


        System.out.println("Adding drama records...........");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 4000, 668, 1005173);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 5900, 837, 1493252 );
        DramaRecords dramaRecords3 = new DramaRecords(drama3, 230000 , 11000, 14583236);
        DramaRecords dramaRecords4 = new DramaRecords(drama4, 56000, 31000, 5630125);
        DramaRecords dramaRecords5 = new DramaRecords(drama5, 20000, 674, 1155765);
        DramaRecords dr6 = new DramaRecords(drama6,8500, 627, 1276529);
        DramaRecords dr7 = new DramaRecords(drama7,6800, 531, 1014465);
        DramaRecords dr8 = new DramaRecords(drama8,3200, 99, 207539);
        DramaRecords dr9 = new DramaRecords(drama9,9700, 783, 1_210_686);
        DramaRecords dr10 = new DramaRecords(drama10,26000, 1800, 4_187_410);
        DramaRecords dr11 = new DramaRecords(drama11, 27000,499,  1291714);
        DramaRecords dr12 = new DramaRecords(drama12,3200, 122, 233691);
        DramaRecords dr13 = new DramaRecords(drama13,35000, 1600, 1940805);
        DramaRecords dr14 = new DramaRecords(drama14,50000, 1700, 2862186);
        DramaRecords dr15 = new DramaRecords(drama15,291, 16, 24046);
        DramaRecords dr16 = new DramaRecords(drama16,18000, 892, 2686131);
        DramaRecords dr17 = new DramaRecords(drama17,5900, 501, 1410716);
        DramaRecords dr18 = new DramaRecords(drama18,27000, 1800, 3824467 );
        DramaRecords dr19 = new DramaRecords(d19, 3400, 152, 316312);
        DramaRecords dr20 = new DramaRecords(d20, 921, 91, 163560);
        //DramaRecords.autoCreateDramaRecords();




        drama1.addCast(ishana);
        drama1.addCast(mirSabbir);
        drama2.addCast(shoshi);
        drama2.addCast(lavlu);
        drama2.addCast(imran);
        drama3.addCast(mehzabien);
        drama3.addCast(apurbo);
        drama4.addCast(apurbo);
        drama4.addCast(mithila);
        drama5.addCast(dipakSumon);
        drama5.addCast(dipannita);
        drama6.addCast(mehzabien);
        drama6.addCast(tausif);
        drama7.addCast(mehzabien);
        drama7.addCast(zovan);
        drama8.addCast(mithila);
        drama8.addCast(apurbo);
        drama9.addCast(sharlin);
        drama9.addCast(apurbo);
        drama10.addCast(mehzabien);
        drama10.addCast(apurbo);
        drama11.addCast(iffatTrisha);
        drama11.addCast(fazlulBabu);
        drama11.addCast(allenShuvro);
        drama11.addCast(eloraGauhor);
        drama12.addCast(ireshZaker);
        drama12.addCast(tariqAnamKhan);
        drama12.addCast(momo);
        drama12.addCast(iffatTrisha);
        drama13.addCast(momo);
        drama13.addCast(iffatTrisha);
        drama14.addCast(nabilaMasuma);
        drama14.addCast(apurbo);
        drama15.addCast(mehzabien);
        drama15.addCast(fazlulBabu);
        drama16.addCast(apurbo);
        drama16.addCast(mosumiHamid);
        drama16.addCast(tahsan);
        drama16.addCast(mithila);
        drama17.addCast(apurbo);
        drama17.addCast(momo);
        drama17.addCast(ireshZaker);
        drama17.addCast(mithila);
        drama17.addCast(farhanaMili);
        drama17.addCast(apurbo);
        drama17.addCast(sarika);
        d19.addCast(mehzabien);
        d19.addCast(zovan);
        d19.addCast(fazlulBabu);
        Artist [] d20cast = {neela,zovan,tariqAnamKhan};
        d20.addCast(d20cast);


    }

    public void addRecordsArtistOnly(){

        System.out.println("Adding Artist records.............");
        Artist afranNisho = new Artist("Afran", "Nisho");
        Artist art3 = new Artist("Apurbo");
        Artist art5 = Artist.createArtist("Allen", "Shuvro");
        Artist art7 = new Artist("Farhan Ahmed", "Zovan" );
        Artist art9 = Artist.createArtist("Nayeem");
        Artist art11 = new Artist("Sajal");
        Artist art13= new Artist("Tausif", "Mahbub");
        Artist art15 = new Artist ("Zahid", "Hassan");
        Artist art17 = new Artist ("AKM", "Hassan");
        Artist art19 = new Artist("Mir", "Sabbir");
        Artist art21 = new Artist("Mahfuz", "Ahmed");
        Artist art23 = new Artist("Partho", "Barua");
        Artist intekhabDinar = new Artist("Intekhab", "Dinar");
        Artist mosharrafKarim = new Artist("Mosharraf", "Karim");
        Artist hassanMasud = new Artist("Hassan", "Masud");
        Artist art31 = new Artist("Salman", "Muktadir");


        Artist art2 = new Artist("Mehzabien", "Chowdhury");
        Artist art4 = new Artist("Sabnam", "Faria");
        Artist art6 = new Artist( "Tisha", "Nusrat Imrose");
        Artist art8 = Artist.createArtist("Sabila", "Noor");
        Artist art10 = new Artist("Aparna", "Ghosh");
        Artist art12 = new Artist("Tasnuva", "Tisha");
        Artist art14 = new Artist ("Safa", "Kabir");
        Artist art16 = new Artist ("Mousumi", "Hamid");
        Artist art18 = new Artist("Shokh");
        Artist art20 = new Artist("Nowshin");
        Artist art22 = new Artist("Zakia", "Bari Momo");
        Artist art24 = new Artist("Urmila", "Kaur");
        Artist art26 = new Artist("Farhana", "Mili");
        Artist art28 = new Artist("Bindu", "Afsan ara");
        Artist art30 = new Artist("Toya", "Mumtahina");
        Artist art32 = new Artist("Nabila");
        Artist art34 = new Artist("Badhon");
        Artist art36 = new Artist( "Neelanjona", "Neela");
        Artist art38 = new Artist ("Nadia");
        Artist art40 = new Artist ("Shahtaj");
        Artist art42 = new Artist ("Purnima", "Dilara Hashem");
        Artist art44 = new Artist ("Pia", "Bipasha");
        Artist art46 = new Artist ("Farhana", "Mili");
        Artist art48 = new Artist ("Vabna");
        Artist art50 = new Artist ("Snigdha", "Momin");
        Artist art52 = new Artist ("Ajmeri", "Asha");
        Artist art54 = new Artist ("Shanarei", "Shanu");

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

            treeValue.put(dramaRecords.getDrama().getDramaName() , dramaRecords.rank1A());
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

    public void doRanking2(){

        System.out.println("-------------Ranking in DESCECENDING order using rank1B--------------------------");

        for(DramaRecords dramaRecords: DramaRecords.getAllDramaRecords()){

            //Ranking based on views
            //Double viewsAsDouble = Double.valueOf(dramaRecords.getViews());
            //treeValue2.put(dramaRecords.getDrama().getDramaName() , viewsAsDouble);

            treeValue2.put(dramaRecords.getDrama().getDramaName() , dramaRecords.rank1B());

            //treeValue.clear();
            //treeValue.put(dramaRecords.getDrama().getDramaName(), dramaRecords.rank1());

        }


        Map sortedMap = sortByValues(treeValue2);

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

        Map<K, V> sortedByValues = new TreeMap<K,V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    private static void quickStart(){

        System.out.println("QUICKSTART method.......");
        Platform platform1 = new Platform();
        platform1.addRecords2();
        gap();
        platform1.showPlatform();
        gap();
       // platform1.doRanking();
        platform1.doRanking2();
    }

    public static void gap (){
        for (int i= 0; i<=5; i++){
        System.out.println(" ");
        }
    }

    public static void  automateAddingArtistData(HashSet<Artist> setOfArtist){
        print("Enter the number of artists details you'd like to add");
        Scanner scan = new Scanner(System.in);

        try{
            int num = scan.nextInt();
            if (num>=1) {
                for (int i = 0; i < num; i++) {
                    setOfArtist.add(Artist.autoCreateArtist());
                }
                for (Artist art1 : Artist.getSetOfArtist()) {

                    System.out.println(art1);
                }
            }
        } catch (Exception e){
            print("Error, enter a number");
        }
    }

    public static void  automateAddingDrama(HashSet<Drama> setOfDramas){
        print("Enter the number of dramas you'd like to add");
        Scanner scan = new Scanner(System.in);

        try{
            int num = scan.nextInt();
            if (num>=1) {
                for (int i = 0; i < num; i++) {

                    setOfDramas.add(Drama.autoCreateDrama());
                }
                for (Drama drama : Drama.getSetOfDramas()) {

                    System.out.println(drama.getDramaId() + ": " + drama.getDramaName());
                }
            }
        } catch (Exception e){
            print("Drama : Error, enter a number");
        }
    }

    public static void  automateAddingDramaRecords(HashSet<DramaRecords> setOfDramarecords){
        print("Enter the number of drama records you'd like to add");
        Scanner scan = new Scanner(System.in);

        try{
            int num = scan.nextInt();
            if (num>=1) {
                for (int i = 0; i < num; i++) {

                    setOfDramarecords.add(DramaRecords.autoCreateDramaRecords());
                }
                for (DramaRecords dramaRecords : DramaRecords.getSetOfDramaRecords()) {

                    System.out.println(dramaRecords.getDrama().getDramaName()+" : "+ dramaRecords.measureLikesStrength());
                    System.out.println(dramaRecords.getDramaNameOfThisRecord()+" : "+ dramaRecords.rank1B());
                }
            }
        } catch (Exception e){
            print("DR : Error, enter a number");
        }


    }

    public void addRandomDummyRecords(int howMany){
        /*for (int j = 1; j<=20; j++){
            Artist artist = new Artist("Dummy Artist " + j);
        }*/
        addRecordsArtistOnly();
        for (int i =1; i <=howMany; i++){
            Drama drama1 = new Drama("Drama " + i);

            if(!Artist.getSetOfArtist().isEmpty()){

                //drama1.addCast(Artist.getSetOfArtist().iterator().next());
                HashSet<Artist> tempSetOfArtist = Artist.getSetOfArtist();
                List<Artist> sortedArtistList = new ArrayList<>(tempSetOfArtist);

                int numberOfArtist = Artist.getNumOfArtist();
                int randomNumber1 = (int) (Math.random() * numberOfArtist );
                drama1.addCast(sortedArtistList.get(randomNumber1));

                int randomNumber2 = (int) (Math.random() * numberOfArtist);
                while(randomNumber2 == randomNumber1){
                    randomNumber2 = (int) (Math.random() * numberOfArtist);

                }
                drama1.addCast(sortedArtistList.get(randomNumber2));
            }
            new DramaRecords(drama1);
        }

    }


}
