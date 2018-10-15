package dramaRating.Model;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class DramaRecords {

    private Drama drama;
    private int likes;
    private int dislikes;
    private int views;
    private int averageViewsPerDay;
    private double likeability;
    /*private Date datePublished;
    private Date lastUpdated;*/
    private Calendar datePublished;
    private Calendar dateDataCollected;
    private Calendar lastUpdated;
    private int screenTimeInMins;

    private static int numOfDramaRecords;

    public static HashSet<DramaRecords> getSetOfDramaRecords() {
        return setOfDramaRecords;
    }

    private static HashSet<DramaRecords> setOfDramaRecords = new HashSet<>();


    public DramaRecords(Drama drama, int likes, int dislikes, int views) {
        boolean validInput = (views>= (likes+dislikes));
        /*if(!validInput){
            views = 1;
            likes= 1;
            dislikes =1;
        }*/
        this.drama = drama;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
        drama.setDramaRecords(this);
        numOfDramaRecords ++;  // adding to the numOfDramaRecords static filed of DramaRecords class
        setOfDramaRecords.add(this);
    }
    public DramaRecords(Drama drama) {
        this.drama = drama;
        this.likes = this.getMeRandomLikes();
        this.dislikes = this.getMeRandomLikes();
        this.views = this.getMeRandomViews();
        drama.setDramaRecords(this);
        numOfDramaRecords ++;  // adding to the numOfDramaRecords static filed of DramaRecords class
        setOfDramaRecords.add(this);
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
   //the following returns HashSet containing all dramarecords
    public static HashSet<DramaRecords> getAllDramaRecords(){ return setOfDramaRecords;}

    @Override
    public String toString() {

        return "DramaRecords{" + "Drama name "+ drama.getDramaName() +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", views=" + views +  "," + this.measureLikesStrength() + "%" +
                '}';
    }

    public double getTotalLikesAndDislikes(){

        return (double)(likes+dislikes);
    }
    public double getLikesMinusDislikes(){

        return ((likes<=0) && dislikes<=0)? 0.00 : (double)(likes-dislikes);
    }

    public double getLikesRatioAgainstTotalViews(){

        return (this.getLikes()>0) ?  (double)(likes/views)*100 : 0.00;
    }

    public double getDislikesRatioAgainstTotalViews(){

        return (this.getDislikes()>0) ?(dislikes/(double)views)*100 : 0.00;
    }


    public double calcLikability1(){

        return  (double)((likes-dislikes)/views)*100;
    }

    public double calcLikability2(){

        return getLikesRatioAgainstTotalViews()- getDislikesRatioAgainstTotalViews();
    }

    public double measureLikesStrength(){

            return (likes<=0 && dislikes<=0) ? 0.0 : ((likes - dislikes) / getTotalLikesAndDislikes()) * 100;

    }

    public double simpleRank(){

        return (((getTotalLikesAndDislikes()/views)*100)+ measureLikesStrength())/2;

    }


    public double rank1A (){

        double d = (((getTotalLikesAndDislikes()/views)*100)*measureLikesStrength());
        String str = String.format("%1.3f", d);
        d = Double.valueOf(str);
        return d;

    }
    public double rank1B (){

        double percentageOfLikesAgainstTotalViews = (this.getLikesMinusDislikes()/views)*100.00;
       // double rankValue = (percentageOfLikesAgainstTotalViews * measureLikesStrength()) + this.getViews(); // if only number of views were taken into consideration

        // First, it is deducting dislikes from likes and then
        // getting a percentage against total value.
        // Finally, the value is being multiplied by percentage of likes against
        // total likes and dislikes to see how strong it is by a measure of how many people
        //reacted to it by liking or disliking it.

        // Here, number of views is relative to the proportion of likes or dislikes

        // The max value that can be achieved is 1000.00
        // if 100 views receieved 100 likes, it will only then receive 100
        // (100-0)/100)*100)*100
        //
        double rankValue = percentageOfLikesAgainstTotalViews * measureLikesStrength();
        String str = String.format("%1.3f", rankValue);
        rankValue = Double.valueOf(str);
        return rankValue;

    }
    private int diff (Calendar dateUploaded, Calendar dateDataCollected){

        //This method calculates time elapsed since video was uploaded

        long end = dateDataCollected.getTimeInMillis();
        long start = dateUploaded.getTimeInMillis();

        long diff = end- start;
        System.out.println(diff);

        int daysPassed = (int) ((diff / (1000*60*60*24)));
        System.out.println("Days Passed " + daysPassed);
        return daysPassed;

    }

    private int getAverageViewsPerDay(){
        return this.getViews()/diff(datePublished,dateDataCollected);
    }
    public double rank2A(){

        return this.averageViewsPerDay;
    }


    public static void showAllDramaRecords(){

        for ( DramaRecords dramaRecord : setOfDramaRecords){

            System.out.println(dramaRecord);
        }
    }

    public static DramaRecords autoCreateDramaRecords(){

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);

        System.out.print("ENTER Drama Id");
        int dramaId = scan1.nextInt();


        System.out.print("ENTER THE DRAMA NAME : ");
        String dramaName = scan2.next();


        System.out.print("ENTER THE DRAMA LIKES : ");
        int dramaLikes = scan3.nextInt();

        System.out.print("ENTER THE DRAMA DISLIKES : ");
        int dramaDislikes = scan4.nextInt();

        System.out.print("ENTER THE NUMBER OF VIEWS : ");
        int dramaViews = scan5.nextInt();

        System.out.println("I got " + dramaName + " " + dramaLikes + " "+ dramaDislikes + dramaViews );

        DramaRecords dramaRecords;
        dramaRecords = new DramaRecords(new Drama(dramaId, dramaName), dramaLikes, dramaDislikes, dramaViews);

        System.out.println("Creating a drama record");
        return  dramaRecords;
    }

    public int getMeRandomViews(){

        int actualNumber = (int) (Math.random() * 50000 +1);

        return actualNumber;
    }
    public int getMeRandomLikes(){

        int actualNumber = (int) (Math.random() * 10000 +1);
        //System.out.println("Actual number " + actualNumber);
        return actualNumber;
    }
    public int getMeRandomDislikes(){

        int actualNumber = (int) (Math.random() * 10000 +1);
        //System.out.println("Actual number " + actualNumber);
        return actualNumber;
    }
    

}
