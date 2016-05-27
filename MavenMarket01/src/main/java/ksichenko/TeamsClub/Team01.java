package ksichenko.TeamsClub;

import java.util.LinkedList;
import java.util.List;

public class Team01 extends Team {
    public Team01(){

    }

    public Team01(String teamName, int playersQuantity, Trainer trainer) {
        this.teamName = teamName;
        this.playersQuantity = playersQuantity;
        this.trainer = trainer;

        super.addPlayer(new Player("Tim", "Howard", 22, 12));
        super.addPlayer(new Player("Valik", "Demko", 30, 2));
        super.addPlayer(new Player("Amadeus", "Raduskiy", 19, 10));
        super.addPlayer(new Player("Jon", "Kilin", 26, 15));
        super.addPlayer(new Player("Marko", "Gukoch", 41, 18));
    }
    public void printAllplayerList(){
        for (Player player : playersList){
            player.printAllPlayerInformation();
        }
    }
}
