package otherStuff2;

import java.util.Date;

public class DramaRecords {
    private static int numOfDramaRecords;
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
        numOfDramaRecords ++;
    }

    public Drama getDrama(){
        return this.drama;
    }

    public String getDramaNameOfThisRecord(){
        return this.drama.getDramaName();
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

    public static int getNumOfDramaRecords() {
        return numOfDramaRecords;
    }

    @Override
    public String toString() {

        return "DramaRecords{" + "Drama name "+ drama.getDramaName() +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", views=" + views + " Likability is :  " + likeability + this.calcLikability1() + "%" + "," + this.calcLikability3() + "%" +
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

    public double rank1 (){
        //return (views*calcLikability3());
        return (((getTotalLikesAndDislikes()/views)*100)*calcLikability3());

    }
    public double rank2 (){
        //return (views*calcLikability3());
        return (((getTotalLikesAndDislikes()/views)*100)+ calcLikability3())/2;

    }

}
