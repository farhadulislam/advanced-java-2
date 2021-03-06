package dramaRating.Model;

public class DataInsertion {

    public static void insertRecords(){


        System.out.println("Adding Artist records.............");
        Long start = System.currentTimeMillis();
        Artist afranNisho = new Artist("Afran", "Nisho");
        Artist apurbo = new Artist("Apurbo", "Ziaul Faruq");
        Artist allen = Artist.createArtist("Allen", "Shuvro");
        Artist zovan = new Artist("Farhan Ahmed", "Zovan" );
        Artist nayeem = Artist.createArtist("Nayeem");
        Artist sajal = new Artist("Sajal", "Abdullah");
        Artist tausif= new Artist("Tausif", "Mahbub");
        Artist tamimMridha = new Artist("Tamim", "Mridha");
        Artist irfanSazzad = new Artist("Irfan", "Sazzad");
        Artist siam = new Artist("Siyam", "Ahmed");
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

        Artist allenShuvro = new Artist("Allen", "Shuvro");
        Artist ireshZaker = new Artist ("Iresh", "Zaker");
        Artist tahsan = new Artist ("Tahsan", "Khan");
        Artist emon = new Artist ("Emon");
        Artist nirob = new Artist ("Nirob");
        Artist niloy = new Artist ("Niloy", "Alamgir");
        Artist arefinShuvo = new Artist ("Arefin", "Shuvo");

        Artist fazlulBabu = new Artist("Fazlul Hoque", "Babu");
        Artist shatabdiWadud = new Artist ("Shatabdi", "Wadud");
        Artist tariqAnamKhan = new Artist ("Tariq Anam", "Khan");
        Artist shahiduzzamanSelim = new Artist ("Shahiduzzaman", "Selim");
        Artist maznunMizan = new Artist ("Maznun", "Mizan");
        Artist ahmedRubel = new Artist ("Ahmed", "Rubel");
        Artist afzalHossain = new Artist ("Afzal", "Hossain");
        Artist toukirAhmed = new Artist ("Toukir", "Ahmed");
        Artist faruqAhmed = new Artist ("Faruq", "Ahmed");
        Artist ezazulIslam = new Artist ("Dr. Ezazul", "Islam");
        Artist raisulIslamAsad = new Artist ("Raisul Islam", "Asad");
        Artist abulHayat = new Artist ("Abul", "Hayat");
        Artist sohelKhan = new Artist ("Sohel", "Khan");
        Artist sumonPathwari = new Artist ("Sumon", "Pathwari");
        Artist siddik = new Artist ("Siddik", "Rahman");
        Artist kochiKhondokar = new Artist ("Kochi", "Khondokar");


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
        Artist mim = new Artist("Mim");
        Artist nadiaMim = new Artist("Nadia", "Mim");
        Artist tanjinTisha = new Artist("Tanjin", "Tisha");
        Artist someOne = new Artist("Nova");
        Artist shailaSabi = new Artist("Shaila", "Sabi");
        Artist sharminAkhee = new Artist("Sharmin", "Akhee");
        Artist othoi = new Artist ("Othoi");

        Director mabrurBannah = new Director("Mabrur Rashid", "Bannah");
        Director ashfaqueNipun = new Director("Ashfaq", "Nipun");
        Director reduanRony = new Director("Reduan", "Ronnie");
        Director nuhashHumayun = new Director("Nuhash", "Humayun");



        /*******************/
        System.out.println("Adding Natok ...........");
        Drama drama1 = new Drama(Drama.issueDramaId(), "Tiar Khacha");
        Drama drama10 = new Drama(Drama.issueDramaId(), "Golpota Tomari");
        Drama drama2 = new Drama (Drama.issueDramaId(), "Moharani");
        Drama drama3 = new Drama(Drama.issueDramaId(), "Boro Chele");
        Drama drama4 = new Drama(Drama.issueDramaId(), "Batch 27");
        Drama drama5 = new Drama(Drama.issueDramaId(), "Golden A+");
        Drama drama6 = new Drama(Drama.issueDramaId(), "Moyna o Mojnur Golpo");
        Drama drama7 = new Drama(Drama.issueDramaId(), "Se ache duare dariye");
        Drama drama8 = new Drama(Drama.issueDramaId(), "Forever");
        Drama drama9 = new Drama(Drama.issueDramaId(), "Megh Brishtir Alapon");
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
        Drama d33 = new Drama(Drama.issueDramaId(), "Red Rose");
        Drama d34 = new Drama(Drama.issueDramaId(), "Ekti Tin Masher Golpo");
        Drama d35 = new Drama(Drama.issueDramaId(), "26 No Platform");
        Drama d36 = new Drama(Drama.issueDramaId(), "Science er meye Arts er chele");
        Drama d37 = new Drama(Drama.issueDramaId(), "Mannequin Mumu");
        Drama d38 = new Drama(Drama.issueDramaId(), "Porinoti");
        Drama d39 = new Drama(Drama.issueDramaId(), "Tomar Amar Prem");
        Drama d40 = new Drama(Drama.issueDramaId(), "Ei Boishakhe");
        Drama d41 = new Drama(Drama.issueDramaId(), "Lokti Soth Chilo");
        Drama d42 = new Drama(Drama.issueDramaId(), "Maya o Momotar Golpo");
        Drama d43 = new Drama(Drama.issueDramaId(), "Kath Golap");
        Drama d44 = new Drama(Drama.issueDramaId(), "Tomar Apon Hater Dole");
        Drama d45 = new Drama(Drama.issueDramaId(), "Batch 27, last page");
        //Drama d44 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d43 = new Drama(Drama.issueDramaId(), "Restart");
        //Drama d44 = new Drama(Drama.issueDramaId(), "Restart");



        System.out.println("Adding drama records...........");
        DramaRecords dr1 = new DramaRecords(drama1, 4000, 668, 1005173);
        DramaRecords dr2 = new DramaRecords(drama2, 5900, 837, 1493252 );
        DramaRecords dr3 = new DramaRecords(drama3, 230000 , 11000, 14583236);
        DramaRecords dr4 = new DramaRecords(drama4, 56000, 31000, 5630125);
        DramaRecords dr5 = new DramaRecords(drama5, 20000, 674, 1155765);
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
        DramaRecords dr33 = new DramaRecords(d33, 17000, 974, 1690973);
        DramaRecords dr34 = new DramaRecords(d34, 21000, 1100, 2518368);
        DramaRecords dr35 = new DramaRecords(d35, 7400, 608, 954574 );
        DramaRecords dr36 = new DramaRecords(d36, 30000,1800, 3192904 );
        DramaRecords dr37 = new DramaRecords(d37, 15000, 1500, 2471193);
        DramaRecords dr38 = new DramaRecords(d38, 9600, 610, 1009406);
        DramaRecords dr39 = new DramaRecords(d39, 48000, 1800, 4655088 );

        DramaRecords dr40 = new DramaRecords(d40, 19000,1100, 1623365 );
        DramaRecords dr41 = new DramaRecords(d41, 15000,369, 722630 );
        DramaRecords dr42 = new DramaRecords(d42, 1500,127, 218649);
        DramaRecords dr43 = new DramaRecords(d43, 7500,597, 1136074);
        DramaRecords dr44 = new DramaRecords(d44, 11000,1500, 1033093);
        DramaRecords dr45 = new DramaRecords(d45, 59001, 3400, 6099090);



        Artist [] mehzabienAfran = {afranNisho, mehzabien};
        Artist [] mehzabienZovan = {mehzabien,zovan};
        Artist [] mehzabienIrfan = {mehzabien,irfanSazzad};
        Artist [] tishaTahsan = {tisha,tahsan};
        Artist [] apurboAparna = {apurbo,aparna};
        Artist [] afranSalhaNadia = {afranNisho,salhaNadia};


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
        d40.addMoreCast(afranNisho,tanjinTisha);
        d41.addMoreCast(apurbo,iffatTrisha);
        d42.addMoreCast(tisha, intekhab);
        d43.addMoreCast(mehzabien,afranNisho,shailaSabi);
        d44.addMoreCast(zovan,safa);
        d45.addMoreCast(mithila, apurbo, mehzabien);

        Long end = System.currentTimeMillis();
        System.out.println("TIME TAKEN : " + (end-start));

      /*  doRankingForAnArtist(apurbo);
        gap();
        doRankingForAnArtist(mehzabien);
        gap();
        doRankingForAnArtist(afranNisho);
        gap();
        doRankingForAnArtist(tahsan);
        gap();
        doRankingForAnArtist(tisha);
        gap();
        doRankingForAnArtist(mosharraf);*/


    }

    public static void insertArtistsRecordsOnly(){

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
}
