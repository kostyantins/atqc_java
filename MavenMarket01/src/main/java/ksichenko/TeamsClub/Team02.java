package ksichenko.TeamsClub;

import java.util.List;

public class Team02 extends Team {

    public Team02(String teamName, int playersQuantity, Trainer trainer){
        this.teamName = teamName;
        this.playersQuantity = playersQuantity;
        this.trainer = trainer;

        super.addPlayer(new Player("Rick", "Howard", 22, 12));
        super.addPlayer(new Player("Gakuj", "Demko", 30, 2));
        super.addPlayer(new Player("Amadeus", "Raduskiy", 19, 10));
        super.addPlayer(new Player("Luis", "Kilin", 26, 15));
        super.addPlayer(new Player("Daniel", "Gukoch", 41, 18));
    }
}
