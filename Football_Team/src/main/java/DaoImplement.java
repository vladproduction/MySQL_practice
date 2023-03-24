import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImplement implements Dao_engine{
    @Override
    public void create(Player p) {
        try(Connection connect = getConnect()){
            PreparedStatement ps = connect.prepareStatement("insert into player (name,age) values (?,?)");
            ps.setString(1,p.getName());
            ps.setInt(2,p.getAge());
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Player> readAll() {
        List<Player> players = new ArrayList();
        try(Connection c = getConnect()){
            PreparedStatement ps = c.prepareStatement("select * from football_team.player");

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                Player p = new Player(id,name,age);
                players.add(p);
            }
            return players;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    private Connection getConnect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/football_team","root","11111111");
    }
}
