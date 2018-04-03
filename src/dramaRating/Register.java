package dramaRating;


public class Register {

    private static String[] generalRegistry;

    private static String arrayOfArtist [] = {"default", "default 2", "Afran", "Sabila Noor","Sabnam Faria", "Mehzabien"};

    public static void main (String [] args){


        Register reg1 = new Register();

        generalRegistry = new String [arrayOfArtist.length];

        for( int i = 0; i<arrayOfArtist.length; i++){

            if (arrayOfArtist[i]!= " " && arrayOfArtist[i] != null  && arrayOfArtist[i] != "default") {
                generalRegistry[i] = arrayOfArtist[i];
            }
        }

        for (String string : generalRegistry){

            System.out.println(string);
            new Artist(string);

        }

        Artist.showAllArtist();



    }

    public void register(String name){

            generalRegistry[generalRegistry.length - 1] = name;

            System.out.println("Name " + name + " added ");

    }


    public void displayRegister(String [] generalRegistry){

        for(String staff : generalRegistry){
            System.out.println("Staff " + staff);
        }
    }

    public void populateRegistry(){


    }
}
