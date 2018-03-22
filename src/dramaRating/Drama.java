package dramaRating;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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


    public static HashSet<Drama> getSetOfDramas() {
        return setOfDramas;
    }

    public Drama(int dramaId, String dramName){

        this.dramaId = dramaId;
        this.dramaName = dramName;
        numberOfDramas++;
        boolean add = setOfDramas.add(this);
        System.out.println(add ? (this.getDramaId() + " : "+ this.getDramaName() + " added into setOfDramas successfully") : "drama couldn't be added");
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
                System.out.print(artist.getFirstName());
                System.out.print(" | ");

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


}
