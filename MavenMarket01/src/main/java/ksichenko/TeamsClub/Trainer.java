package ksichenko.TeamsClub;


public class Trainer {
    private String trainerName;
    private String trainerSurname;
    private int trainerAge;

    public Trainer(String trainerName, String trainerSurname, int trainerAge){
        this.trainerName = trainerName;
        this.trainerSurname = trainerSurname;
        this.trainerAge = trainerAge;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerSurname() {
        return trainerSurname;
    }

    public void setTrainerSurname(String trainerSurname) {
        this.trainerSurname = trainerSurname;
    }

    public int getTrainerAge() {
        return trainerAge;
    }

    public void setTrainerAge(int trainerAge) {
        this.trainerAge = trainerAge;
    }

    public void printAllTrainerInformation() {
        System.out.println(trainerName);
        System.out.println(trainerSurname);
        System.out.println(trainerAge);
    }
}
