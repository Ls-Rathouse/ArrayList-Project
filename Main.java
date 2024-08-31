import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<Integer> placeholder = new ArrayList<Integer>();
    String[] teamNames1 = {"Calista Allan", "Miyah Terry", "Abel Dixon", "Kady Kelly", "Humzah Kay", "Stefanie Ho", "Brenda Mccormick", "Destiny Mcmanus", "Jace Neale", "Irving Nichols"};
    String[] teamNames2 = {"Willard Mccarthy", "Israel Robles", "Bridget Wolfe", "Kayden Carney", "Wendy Burn", "Talia Ferreira", "Taylan Mcdermott", "Eiliyah Keeling", "Can Pratt", "Andreea Frazier"};
    String[] teamNames3 = {"Ace Valdez", "Gurveer Goff", "Kalum Hodge", "Julie Franks", "Maksim Whelan", "India Lara", "Steven Roth", "Rafferty Vincent", "Anisha Horner", "Keziah Torres"};
    String[] teamNames4 = {"Aleisha Garrett", "Caspar Hills", "Nafeesa Charles", "Aaminah Betts", "Summer Beck", "Tayyib Maldonado", "Farhana Cairns", "Tessa Howe", "Jenson Stephens", "Isra Rutledge"};
    BaketballTeam team1 = new BaketballTeam("First");
    BaketballTeam team2 = new BaketballTeam("Second");
    BaketballTeam team3 = new BaketballTeam("Third");
    BaketballTeam team4 = new BaketballTeam("Fourth");
    for(int i = 0; i < teamNames1.length; i++)
      {
        BaketballPlayer temp = new BaketballPlayer(teamNames1[i], (int)(Math.random() * 17) + 68, placeholder);
        team1.addPlayer(temp);
      }
    for(int i = 0; i < teamNames2.length; i++)
      {
        BaketballPlayer temp = new BaketballPlayer(teamNames2[i], (int)(Math.random() * 17) + 68, placeholder);
        team2.addPlayer(temp);
      }
    for(int i = 0; i < teamNames3.length; i++)
      {
        BaketballPlayer temp = new BaketballPlayer(teamNames3[i], (int)(Math.random() * 17) + 68, placeholder);
        team3.addPlayer(temp);
      }
    for(int i = 0; i < teamNames4.length; i++)
      {
        BaketballPlayer temp = new BaketballPlayer(teamNames4[i], (int)(Math.random() * 17) + 68, placeholder);
        team4.addPlayer(temp);
      }
    for(int i = 0; i < 10; i++)
    {
System.out.println(BaketballTeam.simulateGame(team1, team2));
System.out.println(BaketballTeam.simulateGame(team3, team4));
System.out.println(BaketballTeam.simulateGame(team2, team3));
System.out.println(BaketballTeam.simulateGame(team1, team4));
System.out.println(BaketballTeam.simulateGame(team1, team3));
System.out.println(BaketballTeam.simulateGame(team2, team4));
    }
    System.out.println("\n\n" + team1);
    System.out.println("\n\n" + team2);
    System.out.println("\n\n" + team3);
    System.out.println("\n\n" + team4);
  }
}