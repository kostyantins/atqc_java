

public class Player extends Human implements Comparable<Player> {
    private int number;

    public Player(String name, String surname, int age, int number) {
        super(name, surname, age);
        this.number = number;
    }

    public int getPlayerNumber() {
        return number;
    }

    public void setPlayerNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Player player) {
        return name.compareTo(player.name);
    }

    public void printAllPlayerInformation() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(number);
    }

}

