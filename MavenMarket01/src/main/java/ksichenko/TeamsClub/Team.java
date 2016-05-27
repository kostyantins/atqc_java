package ksichenko.TeamsClub;

import java.util.LinkedList;
import java.util.List;

abstract class Team implements Comparable<Team> {
    protected String teamName;
    protected int playersQuantity;
    protected List<Player> playersList = new LinkedList<>();
    protected Trainer trainer;

    public void addPlayer(Player player) {
        playersList.add(player);
    }
    public void deletePlayer(int player){
        playersList.remove(player);
    }

    public void printAllPlayerList(){
        for (Player player : playersList){
            player.printAllPlayerInformation();
        }
    }

    public void printAllTeamInformation(){
        System.out.println(teamName);
        System.out.println(playersQuantity);
        System.out.println("playersList");
        trainer.printAllTrainerInformation();
    }

    public void printTeamName() {
        System.out.println(teamName);
    }
    public void printPlayersQuantity(){
        System.out.println(playersQuantity);
    }

    @Override
    public int compareTo(Team team) {
        return teamName.compareTo(team.teamName);
    }
}
