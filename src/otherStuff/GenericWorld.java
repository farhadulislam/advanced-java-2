package otherStuff;

//import java.util.List*;

public class GenericWorld {

    public static void main (String [] args){

        Generic<String> strObj1 = new Generic<String>("The Alchemist");
        Generic<Integer> intObj = new Generic<Integer>(2); // Autoboxing

        Generic<Integer> intObj2 = new Generic<Integer>(Integer.valueOf(2)); // This is another way of writing the above statement.

       /*Java compiler does not actually create different versions of Gen, or of any
        other generic class.  Instead, the compiler removes all generic type information,
        substituting the necessary casts, to make the code behave
        as if a specific version of Gen were created. Thus, there is really only one version
        of Gen that actually exists in the program.
        The process of removing generic type
        information is called erasure*/

        strObj1.showType();
        intObj.showType();

        int numberFromGenObj1 = intObj.getGenricObj();//Auto-unboxing. Therefore, no cast is needed.
        int numberFromGenOj2 = intObj2.getGenricObj().intValue(); // not using Auto-unboxing
        String bookName = strObj1.getGenricObj();

        System.out.println(numberFromGenObj1);
        System.out.println(numberFromGenOj2);
        System.out.println(bookName);


    }
}
