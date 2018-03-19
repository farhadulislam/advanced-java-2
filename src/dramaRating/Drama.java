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
    protected static List<Drama> dramaListA;
    private Artist [] artistOnThisDrama;



    private Set<Artist> cast;
    {
        cast = new HashSet<>();
    }


    public Drama(int dramaId, String dramName){

        this.dramaId = dramaId;
        this.dramaName = dramName;
        numberOfDramas++;
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

    public static int getNumberOfDramas() {
        return numberOfDramas;
    }

    public void addCast (Artist artist){

        cast.add(artist);
        System.out.println("cast" + this.getDramaName() + cast.toString());
    }

    public Set<Artist> getCast() {
        return cast;
    }

    public void showCast(){

        for (Artist artist : cast){
            System.out.println(artist);
        }
    }


}
