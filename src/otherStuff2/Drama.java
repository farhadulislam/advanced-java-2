package otherStuff2;

public class Drama {

    private static int numberOfDramas = 0;
    private int dramaId;
    private String dramaName;
    private Double length;
    private DramaRecords dramaRecords;


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

    public void getDramaRecords(String dramaName){


    }

    public DramaRecords getDramaRecords(){

        return dramaRecords;

    }

    public static int getNumberOfDramas() {
        return numberOfDramas;
    }


}