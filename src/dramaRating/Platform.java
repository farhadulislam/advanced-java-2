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
        // platform1.addRecords();
        platform1.addRecords2();
        //platform1.showPlatform();
       // platform1.doRanking();
        //platform1.doRanking2();


       //sortViewWise();
       //sortLikeWise();

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
        Artist irfanSazzad = new Artist("Irfan", "Sazzad");
        Artist tamimMridha = new Artist("Tamim", "Mridha");
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
        Artist emon = new Artist ("Emon");
        Artist nirob = new Artist ("Nirob");
        Artist niloy = new Artist ("Niloy", "Alamgir");
        Artist arefinShuvo = new Artist ("Arefin", "Shuvo");
        Artist maznunMizan = new Artist ("Maznun", "Mizan");
        Artist ahmedRubel = new Artist ("Ahmed", "Rubel");
        Artist afzalHossain = new Artist ("Afzal", "Hossain");
        Artist toukirAhmed = new Artist ("Toukir", "Ahmed");
        Artist faruqAhmed = new Artist ("Faruq", "Ahmed");
        Artist ezazulIslam = new Artist ("Dr. Ezazul", "Islam");
        Artist raisulIslamAsad = new Artist ("Raisul Islam", "Asad");
        Artist abulHayat = new Artist ("Abul", "Hayat");


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
        Artist snigdha = new Artist ("Snigdha", "Momin");
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
        Artist sporshia = new Artist("Sporshia");
        Artist tomaMirza = new Artist("Toma", "Mirza");
        Artist nova = new Artist("Nova", " ");
        Artist prosunAzad = new Artist("Prosun", "Azad");
        Artist prova = new Artist("Sadia Jahan", "Prova");
        Artist munmun = new Artist("Munmum");
        Artist oindrila = new Artist("Oindrila", "Ahmed");




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
        Drama d21 = new Drama(Drama.issueDramaId(), "Se Duare Dariye");
        Drama d22 = new Drama(Drama.issueDramaId(), "Angry Bird");
        Drama d23 = new Drama(Drama.issueDramaId(), "Ekti Moddhyobitto Fridger Golpo");
        Drama d24 = new Drama(Drama.issueDramaId(), "Mon Foring Er Golpo");
        Drama d25 = new Drama(Drama.issueDramaId(), "Beloved");
        Drama d26 = new Drama(Drama.issueDramaId(), "Restart");
        Drama d27 = new Drama(Drama.issueDramaId(), "Hotath Neerar Jonno");
       Drama d28 = new Drama(Drama.issueDramaId(), "Ucchotoro Hishabbiggan");
        Drama d29 = new Drama(Drama.issueDramaId(), "Karnishe jhule thaka prem");
        Drama d30 = new Drama(Drama.issueDramaId(), "Ghure Daranor Golpo");
        Drama d31 = new Drama(Drama.issueDramaId(), "Ami Tomar Kotha Bolbo Kake");
        Drama d32 = new Drama(Drama.issueDramaId(), "Saheb Memsahed");
        //Drama d33 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d34 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d35 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d36 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d37 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d38 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d39 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d40 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d41 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d42 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d43 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d44 = new Drama(Drama.issueDramaId(), "Restart");



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

        DramaRecords dr21 = new DramaRecords(d21, 6900, 543, 1041815);
        DramaRecords dr22 = new DramaRecords(d22, 10000, 694, 1587370);
        DramaRecords dr23 = new DramaRecords(d23, 9800, 745, 920416);
        DramaRecords dr24 = new DramaRecords(d24, 2200, 186, 368778);
        DramaRecords dr25 = new DramaRecords(d25, 16000, 1100, 1622090);
        DramaRecords dr26 = new DramaRecords(d26, 3300, 193, 299981);
        DramaRecords dr27 = new DramaRecords(d27, 8100, 303, 563370);
        DramaRecords dr28 = new DramaRecords(d28, 1100,304, 816225);

        DramaRecords dr29 = new DramaRecords(d29, 1300, 83, 236302);
        DramaRecords dr30 = new DramaRecords(d30, 18000, 677, 1039602);
        DramaRecords dr31 = new DramaRecords(d31, 3500, 235, 357171);
        DramaRecords dr32 = new DramaRecords(d32, 4700, 340, 588631);
        //DramaRecords dr33 = new DramaRecords(d33, 16000, 1100, 1622090);
        //DramaRecords dr34 = new DramaRecords(d34, 3300, 193, 299981);
        //DramaRecords dr35 = new DramaRecords(d35, 8100, 303, 563370);
        //DramaRecords dr36 = new DramaRecords(d36, 1100,304, 816225);
        //DramaRecords dr37 = new DramaRecords(d37, 16000, 1100, 1622090);
        //DramaRecords dr38 = new DramaRecords(d38, 3300, 193, 299981);
        //DramaRecords dr39 = new DramaRecords(d39, 8100, 303, 563370);
        //DramaRecords dr40 = new DramaRecords(d40, 1100,304, 816225);


        //DramaRecords.autoCreateDramaRecords();


        drama1.addMoreCast(ishana,mirSabbir);
        drama2.addMoreCast(shoshi,lavlu, imran);
        drama3.addMoreCast(mehzabien,apurbo);
        drama4.addMoreCast(apurbo, mithila);
        drama5.addMoreCast(dipakSumon, dipannita);
        drama6.addMoreCast(mehzabien, tausif);
        drama7.addMoreCast(mehzabien,zovan);
        drama8.addMoreCast(mithila,apurbo);
        drama9.addMoreCast(sharlin,apurbo);
        drama10.addMoreCast(mehzabien, apurbo);

        drama11.addMoreCast(iffatTrisha, fazlulBabu, allenShuvro, eloraGauhor);
        drama12.addMoreCast(ireshZaker, tariqAnamKhan ,momo, iffatTrisha);
        drama13.addMoreCast(momo, iffatTrisha);
        drama14.addMoreCast(nabilaMasuma, apurbo);
        drama15.addMoreCast(mehzabien, fazlulBabu);
        drama16.addMoreCast(apurbo,mosumiHamid, tahsan, mithila);
        drama17.addMoreCast(apurbo,momo ,ireshZaker ,mithila ,farhanaMili );
        drama18.addMoreCast(apurbo, sarika);
        d19.addMoreCast(mehzabien, zovan, fazlulBabu);
        d20.addMoreCast(neela,zovan,tariqAnamKhan);


        Artist [] mehzabienAfran = {afranNisho, mehzabien};
        Artist [] mehzabienZovan = {mehzabien,zovan};
        Artist [] mehzabienIrfan = {mehzabien,irfanSazzad};
        Artist [] tishaTahsan = {tisha,tahsan};
        Artist [] apurboAparna = {apurbo,aparna};
        Artist [] afranSalhaNadia = {afranNisho,salhaNadia};

        d21.addMoreCast(mehzabienZovan);
        d22.addMoreCast(tishaTahsan);
        d23.addMoreCast(tishaTahsan);
        d24.addMoreCast(tishaTahsan);
        d25.addMoreCast(apurbo,oindrila);
        d26.addMoreCast(apurboAparna);
        d27.addMoreCast(mehzabienIrfan);
        d28.addMoreCast(afranSalhaNadia);
        d29.addMoreCast(afranNisho,orsha);
        d30.addMoreCast(mehzabienAfran);
        d31.addMoreCast(mehzabienAfran); // same as d30
        d32.addMoreCast(mehzabienAfran); // same as d30

        doRankingForAnArtist(apurbo);
        gap();
        doRankingForAnArtist(mehzabien);
        gap();
        doRankingForAnArtist(afranNisho);
        gap();
        doRankingForAnArtist(tahsan);
        gap();
        doRankingForAnArtist(tisha);
        gap();
        doRankingForAnArtist(mosharraf);




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

    public void doRankingForAnArtist(Artist artist){

        System.out.println("Ranking by rank1B for dramas acted  by "+ artist.getFirstName());
        treeValue2.clear();

        int numOfDramasActed = 0;
        double score = 0.00;
        for(DramaRecords dramaRecords: DramaRecords.getAllDramaRecords()){


            if(dramaRecords.getDrama().getCast().contains(artist)){
                numOfDramasActed++;
                score+=dramaRecords.rank1B();

            treeValue2.put(dramaRecords.getDrama().getDramaName() , dramaRecords.rank1B());

            }


        }
        if(treeValue2.isEmpty()){
            System.out.println("No records exits for "+ artist.getFirstName());
        } else {


            Map sortedMap = sortByValues(treeValue2);

            // Ranking.showMap(sortedMap);

            // Get a set of the entries on the sorted map
            Set set = sortedMap.entrySet();

            // Get an iterator
            Iterator i = set.iterator();

            // Display elements
            while (i.hasNext()) {
                Map.Entry me = (Map.Entry) i.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }

        }
        System.out.println("Acted on " + numOfDramasActed + " dramas");
        System.out.println("Average " + score/numOfDramasActed);

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

    public static void sortViewWise(){

        Platform p1 = new Platform();
        p1.addRecords2();
        TreeMap< Integer, String> viewsCounter = new TreeMap<>();

        for(DramaRecords dr : DramaRecords.getSetOfDramaRecords()){

            viewsCounter.put(dr.getViews(), dr.getDramaNameOfThisRecord() );
        }
        gap();

        for (Map.Entry mp: viewsCounter.entrySet()){

            System.out.println(mp.getKey()+ " " + mp.getValue());
        }

    }

    public static void sortLikeWise(){

        Platform p1 = new Platform();
        p1.addRecords2();
        TreeMap< Double, String> viewsCounter = new TreeMap<>();

        for(DramaRecords dr : DramaRecords.getSetOfDramaRecords()){

            viewsCounter.put(dr.measureLikesStrength(), dr.getDramaNameOfThisRecord() );
        }
        gap();

        for (Map.Entry mp: viewsCounter.entrySet()){

            System.out.println(mp.getKey()+ "% viewers liked " + mp.getValue());
        }

    }


}
