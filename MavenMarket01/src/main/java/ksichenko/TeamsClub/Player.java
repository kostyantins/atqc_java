package ksichenko.TeamsClub;

public class Player implements Comparable<Player> {
    private String playerName;
    private String playerSurname;
    private int playerAge;
    private int playerNumber;

    public Player(String playerName, String playerSurname, int playerAge, int playerNumber){
        this.playerName = playerName;
        this.playerSurname = playerSurname;
        this.playerAge = playerAge;
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    @Override
    public int compareTo(Player player) {
        return playerName.compareTo(player.playerName);
    }

    public void printAllPlayerInformation() {
        System.out.println(playerName);
        System.out.println(playerSurname);
        System.out.println(playerAge);
        System.out.println(playerNumber);
    }

}

