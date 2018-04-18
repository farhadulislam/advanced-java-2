package dramaRating;

import java.util.Objects;

public  class Staff {


    private String firstName;
    private String lastName;
    private String staffId;
    private static int totalStaffMemeber = 0;
    public  void showDramasWorkedOn(){};
    public void addDramaToThisMembersRecord(Drama drama){};


    public String getStaffId() {
        return staffId;
    }

    public void issueStaffId(){

        if(this.getClass().getName()=="Artist"){
            this.staffId = "A" + Artist.getNumOfArtist()+ 1 ;
        } else{

           this.staffId = "D" + Director.getNumberOfDirectors()+1;
        }
    }

}
