import java.util.*;

public class Club {
    private String name;
    private int quantityOfTeams;
    private List<Team>listOfTeams = new LinkedList<Team>();
    Club(String name){
        this.name = name;
    }
    public void addToListOfTeams(Team b){
        listOfTeams.add(b);
        quantityOfTeams ++;
    }
    public void removeFromListOfTeams(Team b){
        listOfTeams.remove(b);
        quantityOfTeams --;
    }

    public void printListOfTeams(){
        Collections.sort(listOfTeams);
        for(int i=0;i<listOfTeams.size();i++){
            listOfTeams.get(i).printTeamInfo();
        }
    }
    public void printClubInfo(){
        System.out.println("Club "+name+" Quantity of teams: "+quantityOfTeams);
    }
}
