package polymorphic.duck;

public class QuackDecorator implements Quackable {

    private Quackable myQuackable;
    private static int ourQuackCount = 0;

    public QuackDecorator (Quackable theQuackable){

        myQuackable = theQuackable ;
    }

    public void quack(){

        ourQuackCount ++;
        myQuackable.quack();
    }

    public static int getQuackCount (){

        return ourQuackCount;
    }
}
