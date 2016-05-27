import java.util.LinkedList;
import java.util.List;

public class Club {
    private String clubName;
    private int teamQuantity = 2;
    private List<Team> teamList = new LinkedList<>();

    public List<Team> getTeamList() {
        return teamList;
    }

    public void printAllTeamList(){
        for (Team team : teamList){
            team.printAllTeamInformation();
        }
    }

    public Club() {
        teamList.add(new Team01("Team01", 5, new Trainer("Phill", "Jackson", 38)));
        teamList.add(new Team02("Team02", 5, new Trainer("Zinadin", "Zidan", 52)));
    }
}
