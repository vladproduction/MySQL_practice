import java.util.List;

public interface Dao {

    public void create(Player p);
    public List<Player> readAll();
    public void update(Player current, Player candidate);
    public void remove(int id_player);
    public void removeAll();
    public void makeTransaction();
}
