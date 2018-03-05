package otherStuff2;

public class LikeabilityIndex {

    public static void main (String [] args ){

        Drama drama1 = new Drama(1, "Patriot");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 100, 20, 200);
        String index1 = dramaRecords1.toString();

        System.out.println(index1);

    }
}
