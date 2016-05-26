import java.util.*;

public class Team implements Comparable<Team> {
    private String name;
    private int quantityOfPlayers = 0;
    private Coach coach;
    private List<Player> listOfThePlayers = new LinkedList<Player>();
    private List<Person> listOfTeamParticipants = new LinkedList<Person>();
    Team(String name){
        this.name = name;
    }
    Team(String name, Coach coach){
        this.name = name;
        this.coach = coach;
    }
    public void addToListOfThePlayers(Player b){
        listOfThePlayers.add(b);
        quantityOfPlayers ++;
    }
    public void removeFromListOfThePlayers(Player b){
        listOfThePlayers.remove(b);
        quantityOfPlayers --;
    }
    public void printListOfThePlayers(){
        Collections.sort(listOfThePlayers);
        for(int i=0;i<listOfThePlayers.size();i++){
            listOfThePlayers.get(i).printInFoOfPerson();
        }
    }
    public void setTheCoach(Coach coach){this.coach = coach;}

    public Coach getTheCoach(){return coach;}

    public void deleteTheCoach(){ this.coach = null;}

    public void replaceTheCoach(Coach b){this.coach = b;}

    public void printTeamInfo(){
        System.out.print("Team "+name+" ; "+quantityOfPlayers+" Players;"+" Coach: ");
        coach.printInFoOfPerson();
    }

   // @Override
    public int compareTo(Team b) {
        return b.name.compareTo(this.name);
    }
}
