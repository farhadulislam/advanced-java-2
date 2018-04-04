package dramaRating;

import java.util.*;

public class Drama {

    private static int numberOfDramas = 0;
    private int dramaId;
    private String dramaName;
    private Double length;
    private String eTag;
    private String [] items;
    private String youTubeVideoId;
    private DramaRecords dramaRecords;
    private Director director;
    private Set<Artist> cast = new HashSet<>();
    private static HashSet<Drama> setOfDramas = new HashSet<>();
    private static TreeSet<Integer> dramaIds = new TreeSet<Integer>(Collections.singleton(Integer.valueOf(0)));



    public static HashSet<Drama> getSetOfDramas() {
        return setOfDramas;
    }

    public Drama(int dramaId, String dramName){

        this.dramaId = dramaId;
        this.dramaName = dramName;
        dramaIds.add(this.dramaId);
        numberOfDramas++;
        boolean add = setOfDramas.add(this);
        System.out.println(add ? (this.getDramaId() + " : "+ this.getDramaName() + " added into setOfDramas successfully") : "drama couldn't be added");
    }

    public Drama(String dramName){

        this.dramaId = Drama.issueDramaId();
        this.dramaName = dramName;
        dramaIds.add(this.dramaId);
        numberOfDramas++;
        boolean add = setOfDramas.add(this);
        System.out.println(add ? (this.getDramaId() + " : "+ this.getDramaName() + " added into setOfDramas successfully") : "drama couldn't be added");
    }

    public static int issueDramaId (){

        return dramaIds.last().intValue() + 1;
    }

    public int getDramaId() {
        return dramaId;
    }

    public void setDramaId(int dramaId) {
        this.dramaId = dramaId;
    }

    public String getDramaName() {
        return dramaName;
    }

    public void setDramaName(String dramaName) {
        this.dramaName = dramaName;
    }

    public DramaRecords getDramaRecords(){

        return dramaRecords;

    }

    public void setDramaRecords(DramaRecords dramaRecords){
        this.dramaRecords = dramaRecords;

    }

    public static int getNumberOfDramas() {
        return numberOfDramas;
    }

    public void addCast (Artist artist){

        cast.add(artist);
        artist.addDramaToArtistsRecords(this);
        //System.out.println("Cast " + this.getDramaName() + cast.toString());
    }

    public Set<Artist> getCast() {

        return cast;
    }

    public void showCast(){

        if(this.cast.isEmpty()){
            System.out.println("No cast added for this drama yet");
        } else {
            System.out.print("CAST : ");
            for (Artist artist : cast) {
                if(artist.getFirstName()!= null){
                System.out.print(artist.getArtistFullName());
                System.out.print(" | ");
                } else {
                    System.out.print("ERR artist" + " | " );
                }

            }
            System.out.println(".");
            System.out.println("END");
        }
    }

    public static void showAllDramas(){

        for(Drama drama:setOfDramas){

            if(drama.getDramaRecords()!=null){
                System.out.print("Details available for  : ");
                System.out.println(drama.getDramaName().toUpperCase());
                System.out.println("RANK-1 value : " + drama.getDramaRecords().rank1());
                drama.showCast();
                System.out.println(" ");
            } else {
                System.out.print("Only name can be shown for : ");
                System.out.println(drama.getDramaName());
                System.out.println(" ");
            }
        }
    }
    public static Drama autoCreateDrama(){

        //Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        //System.out.print("ENTER Drama Id");

        //int dramaID = scan1.nextInt();
        System.out.print("ENTER THE DRAMA NAME : ");
        String dramaName = scan2.next();

        System.out.println( "I got : " + dramaName);


        Drama drama = new Drama( dramaName);

        System.out.println("CREATED! " + "Drama ID :" + drama.getDramaId() + "Drama name : "+ drama.getDramaName());
        Scanner userOption = new Scanner(System.in);
        System.out.println("Wanna add cast for this drama ?");

        String userAnswer = userOption.next().toUpperCase();
        if(userAnswer=="Y"|| userAnswer=="YES"){
            System.out.println("How many?");
            Scanner howMany = new Scanner (System.in);
            int howManyArtist = howMany.nextInt();
            for(int i = 0; i<howManyArtist; i++) {
                System.out.println("Provide a name");
                Scanner artistName = new Scanner(System.in);
                String artistNameStr = artistName.next();
                Artist newArtist = new Artist(artistNameStr);
                drama.addCast(newArtist);
                System.out.println("This "+ artistNameStr + " was added to "+ drama.getDramaName());
            }
        }
        return  drama;
    }


}
