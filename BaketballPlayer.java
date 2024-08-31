import java.util.ArrayList;
class BaketballPlayer
  {
    private String name;
    private int height;
    private ArrayList<Integer> gameRecord;
    
    public BaketballPlayer(String name, int height, ArrayList<Integer> record)
    {
      this.name = name;
      this.height = height;
      gameRecord = new ArrayList<Integer>();
      for(int i = 0; i < record.size(); i++)
        {
          gameRecord.add(record.get(i));
        }
    }
    
    public void game(int pointScored)
    {
      gameRecord.add(pointScored);
    }

    public double average()
    {
      double total = 0;
      for(int i = 0; i < gameRecord.size(); i++)
        {
          total += gameRecord.get(i);
        }
      return total / gameRecord.size();
    }

    public int bestGame()
    {
      int best = 0;
      for(int i = 1; i < gameRecord.size(); i++)
        {
          if(gameRecord.get(best) < gameRecord.get(i))
          {
            best = i;
          }
        }
      return gameRecord.get(best);
    }

    public String getName()
    {
      return name;
    }

    public int getHeight()
    {
      return height;
    }

    public int getGameScore()
    {
      int total = 0;
      for(int i = 0; i < gameRecord.size(); i++)
        {
          total += gameRecord.get(i);
        }
      return total;
    }

    public int getGameScore(int selecter)
    {
      return gameRecord.get(selecter);
    }

    public String toString()
    {
      return name + "\t" + height / 12 + "\'" + height % 12 + "\"\t" + (int)(average() * 100) / 100.0 + " ppg\t";
    }
  }