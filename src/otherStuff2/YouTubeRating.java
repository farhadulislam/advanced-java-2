package otherStuff2;

import java.io.IOException;
import java.util.HashMap;

public class YouTubeRating {

    public static void main(String[] args) throws IOException {
        YouTube youtube = getYouTubeService();
        try {
            HashMap<String, String> parameters = new HashMap<>();
            parameters.put("id", "Ks-_Mh1QhMc,c0KYU2j0TM4,eIho2S0ZahI");
            parameters.put("onBehalfOfContentOwner", "");

            YouTube.Videos.GetRating videosGetRatingRequest = youtube.videos().getRating(parameters.get("id").toString());
            if (parameters.containsKey("onBehalfOfContentOwner") && parameters.get("onBehalfOfContentOwner") != "") {
                videosGetRatingRequest.setOnBehalfOfContentOwner(parameters.get("onBehalfOfContentOwner").toString());
            }

            VideoGetRatingResponse response = videosGetRatingRequest.execute();
            System.out.println(response);
        }
    }
}
