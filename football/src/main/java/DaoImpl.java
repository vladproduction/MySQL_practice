import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao{
    @Override
    public void create(Player p) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("insert into player (name, last_name, age, position) " +
                    "values (?,?,?,?)");
            ps.setString(1,p.getName());
            ps.setString(2,p.getLast_name());
            ps.setInt(3,p.getAge());
            ps.setString(4, p.getPosition());
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Player> readAll() {
        List<Player> players = new ArrayList();
        try (Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("select * from football.player");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_player");
                String name = rs.getString("name");
                String last_name = rs.getString("last_name");
                int age = rs.getInt("age");
                String position = rs.getString("position");
                Player player = new Player(id,name,last_name,age,position);
                players.add(player);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return players;

    }

    @Override
    public void update(Player current, Player candidate) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("update player set " +
                    "name = ?, last_name = ?, age = ?, position = ?" +
                    " where name in (?) and last_name = (?) and age = ? and position = (?)");
            ps.setString(1, candidate.getName());
            ps.setString(2, candidate.getLast_name());
            ps.setInt(3,candidate.getAge());
            ps.setString(4, candidate.getPosition());
            ps.setString(5, current.getName());
            ps.setString(6, current.getLast_name());
            ps.setInt(7,current.getAge());
            ps.setString(8, current.getPosition());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("update: fail");
        }
    }

    @Override
    public void remove(int id) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("delete from player where id_player=?");
            ps.setInt(1,id);
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void removeAll() {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("delete from football.player");
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void makeTransaction() {
        try(Connection c = getConnection()){
            c.setAutoCommit(false);
            Player p = new Player(1,"player_AAA","player_aaa",10,"position_playerA");
            PreparedStatement ps = c.prepareStatement("insert into football.player (id_player, name, last_name, age, position) " +
                    "values (?, ?, ?, ?, ?)");
            ps.setInt(1,p.getId_player());
            ps.setString(2,p.getName());
            ps.setString(3,p.getLast_name());
            ps.setInt(4,p.getAge());
            ps.setString(5,p.getPosition());
            ps.execute();
            Player p2 = new Player(2,"player_BBB","player_bbb",11,"position_playerB");
            PreparedStatement ps2 = c.prepareStatement("insert into football.player (id_player, name, last_name, age, position) " +
                    "values (?, ?, ?, ?, ?)");
            ps2.setInt(1,p2.getId_player());
            ps2.setString(2,p2.getName());
            ps2.setString(3,p2.getLast_name());
            ps2.setInt(4,p2.getAge());
            ps2.setString(5,p2.getPosition());
            ps2.execute();
            c.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root","11111111");
    }
}
