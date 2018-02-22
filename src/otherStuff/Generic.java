package otherStuff;

public class Generic <T> {

    private T t;

    public Generic(T t) {
       this.t = t;
    }

    public T getGenricObj(){ return t;}

    public void showType (){

        System.out.println("The type of T is " + t.getClass().getName());
    }
}
