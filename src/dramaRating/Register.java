package dramaRating;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Register {

    private String[] staffStringArray = new String[1000];

    public static void main (String [] args){


    }

    public void register(){

        // add elements to the array

        staffStringArray[0] = "Books";
        staffStringArray[1] = "Pens";
        staffStringArray[2] = "Pencils";
        staffStringArray[3] = "Notebooks";

    }
    

    public void displayRegister(String [] staffStringArray){

        for(String staff : staffStringArray){
            System.out.println("Staff " + staff);
        }
    }
}
