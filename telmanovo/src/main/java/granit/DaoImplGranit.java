package granit;

import niva.DaoNiva;
import niva.PlayerNiva;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DaoImplGranit implements DaoGranit {
    @Override
    public void create(PlayerGranit pg) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("insert into granit (name, last_name, age, position, number)" +
                    "values (?,?,?,?,?)");
            ps.setString(1,pg.getName());
            ps.setString(2,pg.getLast_name());
            ps.setString(4, pg.getPosition());
            ps.setInt(3,pg.getAge());
            ps.setInt(5,pg.getNumber());
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<PlayerGranit> readAll() {
        return null;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/telmanovo","root","11111111");
    }
}
