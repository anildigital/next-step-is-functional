package java_way;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProcessUsers {

    public static List<String> activeById(List<User> us) {
        List<User> users = new ArrayList<User>();

        for (User u : us) {
            if (u.getActive()) users.add(u);
        }

        Collections.sort(users, new Comparator<User>() {
            public int compare(User a, User b) {
                return a.getId() - b.getId();
            }
        });

        List<String> finalUsers = new ArrayList<String>();

        for (User u : users) {
            finalUsers.add(u.getLastname());
        }

        return finalUsers;
    }

    public static void main(String[] args) {
        List<User> inputUsers = new ArrayList<User>();
        inputUsers.add(new User(11, "Nick", "Smith", false));
        inputUsers.add(new User(89, "Ken", "Pratt", true));
        inputUsers.add(new User(23, "Jack", "Sparrow", true));

        List<String> activeUsersById = activeById(inputUsers);

        System.out.println(activeUsersById);
    }

}
