import java.util.Comparator;

public class Player implements Comparator<Player>, Comparable<Player>{
    
    private String name;
    private int score;

    public Player()
    {
        
    }

    public Player(String name,int score){
        this.name = name;
        this.score =score;
    }

    public String getName() {
        return name.toLowerCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void sortSameScore(Player[] players){
        for(int i = 0; i < players.length; i++){
            for(int j = i + 1; j < players.length; j++){
                if(players[i].getScore() == players[j].getScore()){
                    Player temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }
    }

    @Override
    public int compareTo(Player o) {
       
        return (this.getName().compareTo(o.getName()));
        
    }

    @Override
    public int compare(Player o1, Player o2) {
        
        return (o1.getScore() - o2.getScore());

        
    }
    
   

}