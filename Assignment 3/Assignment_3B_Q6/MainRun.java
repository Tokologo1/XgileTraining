import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRun {

        public static void main(String[]args)
        {
            //Take a list of players and sort them by score
            Player p1 = new Player();
            List<Player> list = new ArrayList<Player>();
            
            list.add(new Player("Shaggy", 3));
            list.add(new Player("Lacy", 2));
            list.add(new Player("Roger", 10));
            list.add(new Player("Tommy", 4));
            list.add(new Player("Tammy", 1));

            Collections.sort(list, new Player());
                     
            for(Player p : list)
            {
                System.out.println(p.getName() + " " + p.getScore());
                System.out.println(" ");
                
            }
        }
    
}
