package dramaRating;


public class Register {

    private String[] generalRegistry = new String[1000];

    public static void main (String [] args){


        Register reg1 = new Register();
        reg1.register("Arfan");



    }

    public void register(String name){

            generalRegistry[generalRegistry.length - 1] = name;

            System.out.println("Name" + name + " added ");

    }


    public void displayRegister(String [] generalRegistry){

        for(String staff : generalRegistry){
            System.out.println("Staff " + staff);
        }
    }

    public void populateRegistry(){


    }
}
