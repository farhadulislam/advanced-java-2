package otherStuff2;

import java.util.Date;

public class DramaRecords {

    private Drama drama;
    private int likes;
    private int dislikes;
    private int views;
    private double likeability;
    private Date datePublished;

    public DramaRecords(Drama drama, int likes, int dislikes, int views) {
        this.drama = drama;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
    }

    public Drama getDrama(){
        return this.drama;
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

        return "DramaRecords{" + "Drama name "+ drama.getDramaName() +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", views=" + views + " Likability is :  " + likeability + "%" +
                '}';
    }


    public double getLikesRatio (){

        return (likes/(double)views)*100;
    }

    public double getDislikesRatio (){

        return (dislikes/(double)views)*100;
    }

    public double getTotalLikesAndDislikes(){

        return (double)(likes+dislikes);
    }


    public double calcLikability1(){
        //double likeability = ((this.getDislikes()-this.getDislikes())/this.getViews())*100;
       // return getLikesRatio()-getDislikesRatio();
        return  ((likes-dislikes)/(double)views)*100;
    }

    public double calcLikability2(){

        return getLikesRatio()-getDislikesRatio();
    }

    public double calcLikability3(){
        //double likeability = ((this.getDislikes()-this.getDislikes())/this.getViews())*100;
        // return getLikesRatio()-getDislikesRatio();
        return  ((likes-dislikes)/getTotalLikesAndDislikes())*100;
    }


}
