import java.util.ArrayList;
class BaketballTeam
  {
    private String name;
    private int wins;
    private int losses;
    private int ties;
    private ArrayList<BaketballPlayer> roster;

    public BaketballTeam(String name)
    {
      this.name = name;
      wins = 0;
      losses = 0;
      ties = 0;
      roster = new ArrayList<BaketballPlayer>();
    }

    public BaketballPlayer topScorer()
    {
      int best = 0;
      for(int i = 1; i < roster.size(); i++)
        {
          if(roster.get(best).average() < roster.get(i).average())
          {
            best = i;
          }
        }
      return roster.get(best);
    }
    
    public double averageHeight()
    {
      int total = 0;
      for(int i = 0; i < roster.size(); i++)
        {
          total += roster.get(i).getHeight();
        }
      return total / roster.size();
    }

    public void win()
    {
      wins++;
    }

    public void loss()
    {
      losses++;
    }

    public void tie()
    {
      ties++;
    }

    public void addPlayer(BaketballPlayer p)
    {
      roster.add(p);
    }

    public String toString()
    {
      String returnstr = "";
      returnstr += name;
      returnstr += ": (";
      returnstr += wins;
      returnstr += "-";
      returnstr += losses;
      returnstr += ") with ";
      if(ties == 1)
      {
        returnstr += "1 tie";
      }
      else
      {
        returnstr += ties;
        returnstr += " ties";
      }
      returnstr += "\nTop scorer: ";
      returnstr += topScorer().getName();
      returnstr += " (" + topScorer().getGameScore();
      returnstr += ")\nAverage height: ";
      returnstr += (int)averageHeight() / 12;
      returnstr += "\' " + averageHeight() % 12.0;
      returnstr += "\"\n\nRoster:";
      for(int i = 0; i < roster.size(); i++)
        {
          returnstr += "\n" + roster.get(i);
        }
      return returnstr;
    }

    public static String simulateGame(BaketballTeam t1, BaketballTeam t2)
    {
      int team1 = 0;
      int team2 = 0;
      for(int i = 0; i < t1.roster.size(); i++)
        {
          int random = (int)(Math.random() * 26);
          t1.roster.get(i).game(random);
          team1 += random;
        }
      for(int i = 0; i < t2.roster.size(); i++)
        {
          int random = (int)(Math.random() * 26);
          t2.roster.get(i).game(random);
          team2 += random;
        }
      if(team1 > team2)
      {
        t1.win();
        t2.loss();
        return t1.name + " " + team1 + ", " + t2.name + " " + team2 + "\nResults: " + t1.name + " wins\n" + t1.name + " has won " + t1.wins + " games.\n" + t2.name + " has won " + t2.wins + " games.\n";
      }
      if(team1 < team2)
      {
        t1.loss();
        t2.win();
        return t1.name + " " + team1 + ", " + t2.name + " " + team2 + "\nResults: " + t2.name + " wins\n" + t1.name + " has won " + t1.wins + " games.\n" + t2.name + " has won " + t2.wins + " games.\n";
      }
      t1.tie();
      t2.tie();
      return t1.name + " " + team1 + ", " + t2.name + " " + team2 + "\nResults: Tie\n" + t1.name + " has won " + t1.wins + " games.\n" + t2.name + " has won " + t2.wins + " games.\n";
    }
  }