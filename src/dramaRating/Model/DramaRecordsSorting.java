package dramaRating.Model;

import dramaRating.Controller.Platform;

import java.util.Map;
import java.util.TreeMap;

import static dramaRating.Controller.Platform.gap;
import static dramaRating.Model.DataInsertion.insertRecords;

public class DramaRecordsSorting extends DramaRecords {
    private DramaRecords dramaRecords;
    private int sortingId;

    public DramaRecordsSorting(Drama drama, int likes, int dislikes, int views) {
        super(drama, likes, dislikes, views);
    }

    public static void sortViewWise() {

        Platform p1 = new Platform();
        insertRecords();
        TreeMap<Integer, String> viewsCounter = new TreeMap<>();

        for (DramaRecords dr : DramaRecords.getSetOfDramaRecords()) {

            viewsCounter.put(dr.getViews(), dr.getDramaNameOfThisRecord());
        }
        gap();

        for (Map.Entry mp : viewsCounter.entrySet()) {

            System.out.println(mp.getKey() + " " + mp.getValue());
        }

    }

    public static void sortLikeWise() {
        if (DramaRecords.getSetOfDramaRecords().isEmpty()) {

            insertRecords();

            TreeMap<Double, String> viewsCounter = new TreeMap<>();

            for (DramaRecords dr : DramaRecords.getSetOfDramaRecords()) {

                viewsCounter.put(dr.measureLikesStrength(), dr.getDramaNameOfThisRecord());
            }
            gap();

            for (Map.Entry mp : viewsCounter.entrySet()) {

                System.out.println(mp.getKey() + "% viewers liked " + mp.getValue());
            }

        }


    }
}
