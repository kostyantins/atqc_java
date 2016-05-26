public class Test {
    public static void main(String[] args) {

        Coach drapak = new Coach("Drapak","Leha",30);
        Coach lenka = new Coach("Sergienko","Elena",60);

        Player alex = new Player("Megos","Alex",20,2);
        Player adam = new Player("Ondra","Adam",22,1);
        Player dima = new Player("Sharafutdinov","Dmitriy",30,3);
        Player puchio = new Player("Puchio","Alex",28,4);
        Player rubtsov = new Player("Rubtsov","Alex",28,5);
        Player gelmintov = new Player("Gelmintov","Rustam",32,6);
        Player coxey = new Player("Coxey","Shona",27,7);
        Player mitbo = new Player("Mitbo","Magnus",29,8);
        Player maccoll = new Player("Maccoll","Shon",30,9);
        Player andrada = new Player("Andrada","Dani",33,10);

        Team bouldering = new Team("Boulderdash",drapak);
        Team sportclimbing = new Team("RopeMonster",lenka);
        bouldering.addToListOfThePlayers(alex);
        bouldering.addToListOfThePlayers(adam);
        bouldering.addToListOfThePlayers(puchio);
        bouldering.addToListOfThePlayers(rubtsov);
        bouldering.addToListOfThePlayers(gelmintov);

        bouldering.printTeamInfo();
        bouldering.printListOfThePlayers();

        sportclimbing.addToListOfThePlayers(dima);
        sportclimbing.addToListOfThePlayers(coxey);
        sportclimbing.addToListOfThePlayers(maccoll);
        sportclimbing.addToListOfThePlayers(mitbo);
        sportclimbing.addToListOfThePlayers(andrada);

        sportclimbing.printTeamInfo();
        sportclimbing.printListOfThePlayers();

        Club spain = new Club("Spain");
        spain.addToListOfTeams(sportclimbing);
        spain.addToListOfTeams(bouldering);
        spain.printClubInfo();
        spain.printListOfTeams();


    }
}
