package otherStuff;

//import java.util.List*;

public class GenericWorld {

    public static void main (String [] args){

        Generic<String> strObj1 = new Generic<String>("The Alchemist");
        Generic<Integer> intObj = new Generic<Integer>(2);

       //List<Integer, Generic<T>> complexList = new ArrayList<Integer, Generic<T>>(2, "Generic Object");

        System.out.println(strObj1);
        System.out.println(intObj);
        //System.out.println(complexList);

        strObj1.showType();
        intObj.showType();

        int numberFromGenObj = intObj.getGenricObj();//no cast is needed.
        String bookName = strObj1.getGenricObj();

        System.out.println(numberFromGenObj);
        System.out.println(bookName);

    }
}
