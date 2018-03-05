package otherStuff2;

public class DramaRecords {
    private Drama drama;
    private int likes;
    private int dislikes;
    private int views;
    private double likeability;

    public DramaRecords(Drama drama, int likes, int dislikes, int views) {
        this.drama = drama;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public String toString() {

        //double likeability = ((this.getDislikes()-this.getDislikes())/this.getViews())*100;
        double likeability = ((likes-dislikes)/views)*100;

        return "DramaRecords{" +
                "likes=" + likes +
                ", dislikes=" + dislikes +
                ", views=" + views + " Likability is :  " + likeability + "%" +
                '}';
    }


    public double calc (){

        return likes-dislikes;
    }
}
