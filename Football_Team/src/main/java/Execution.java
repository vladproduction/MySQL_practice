import java.util.List;

public class Execution {
    public static void main(String[] args) {
        Dao_engine daoEngine = new DaoImplement();
        Player player1 = new Player(1,"Goran",25);

        List<Player> players = daoEngine.readAll();
        players.add(player1);
        for (int i = 0; i < players.size(); i++) {
            Player p = players.get(i);
            System.out.println(p);
        }

    }
}
