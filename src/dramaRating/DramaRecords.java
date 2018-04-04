package dramaRating;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class DramaRecords {

    private Drama drama;
    private int likes;
    private int dislikes;
    private int views;
    private double likeability;
    private Date datePublished;
    private Date lastUpdated;
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
    /****Testing new approach ****/
    public static HashSet<DramaRecords> getAllDramaRecords(){ return setOfDramaRecords;}

    @Override
    public String toString() {

        return "DramaRecords{" + "Drama name "+ drama.getDramaName() +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", views=" + views + " Likability is :  " + likeability + this.calcLikability1() + "%" + "," + this.measureLikesStrength() + "%" +
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
    public double getLikesMinusDislikes(){

        return (double)(likes-dislikes);
    }


    public double calcLikability1(){

        return  ((likes-dislikes)/(double)views)*100;
    }

    public double calcLikability2(){

        return getLikesRatio()-getDislikesRatio();
    }

    public double measureLikesStrength(){

        return  ((likes-dislikes)/getTotalLikesAndDislikes())*100;
    }

    public double rank1 (){

        return (((getTotalLikesAndDislikes()/views)*100)*measureLikesStrength());

    }

    public double rank1A (){

        double d = (((getTotalLikesAndDislikes()/views)*100)*measureLikesStrength());
        String str = String.format("%1.3f", d);
        d = Double.valueOf(str);
        return d;

    }
    public double rank1B (){
        //return (views*calcLikability3());
        double temp = (this.getLikesMinusDislikes()/views)*100.00;
        double d = temp * measureLikesStrength();
        String str = String.format("%1.3f", d);
        d = Double.valueOf(str);
        return d;

    }
    public double rank2 (){

        return (((getTotalLikesAndDislikes()/views)*100)+ measureLikesStrength())/2;

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
