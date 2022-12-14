package services;
import Enums.TypeOfUser;
import models.*;
import java.util.Comparator;

public class UserComparator implements Comparator <User> {
    @Override
    public int compare(User user1, User user2) {
        if ((user1.getTypeOfUser().equals(TypeOfUser.TEACHER))
                && (user2.getTypeOfUser().equals(TypeOfUser.SENIOR_STUDENT))
                || (user2.getTypeOfUser().equals(TypeOfUser.JUNIOR_STUDENT)))
            return -1;
        else if (user2.getTypeOfUser().equals(TypeOfUser.JUNIOR_STUDENT)
                && (user2.getTypeOfUser().equals(TypeOfUser.SENIOR_STUDENT)))
            return 1;
        else return 0;
}

/*
    @Override
    public int compareTo(User user1) {
        if ((user1.getTypeOfUser().equals(TypeOfUser.TEACHER)){
            return 1;
        } else if (user1.getTypeOfUser().equals(TypeOfUser.SENIOR_STUDENT)){
            return -1;
        } else if (user1.getTypeOfUser().equals(TypeOfUser.JUNIOR_STUDENT))

        {
            return 0;
        }
    }
*/


}


