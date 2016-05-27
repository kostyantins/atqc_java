import java.util.Collection;
import java.util.Collections;

public class Action {
    public static void main(String[] args) {
        Club club = new Club();

        Collections.sort(club.getTeamList());
        club.printAllTeamList();

        System.out.println("------------------------");

        Collections.sort(club.getTeamList().get(0).playersList);
        club.getTeamList().get(0).printAllPlayerList();
    }
}
