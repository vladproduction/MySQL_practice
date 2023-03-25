package granit;

import niva.DaoNiva;
import niva.PlayerNiva;


import java.sql.*;
import java.util.ArrayList;
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
        List<PlayerGranit> granitList = new ArrayList();
        try (Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("select * from telmanovo.granit");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String last_name = rs.getString("last_name");
                int age = rs.getInt("age");
                String position = rs.getString("position");
                int number = rs.getInt("number");
                PlayerGranit playerGranit = new PlayerGranit(id,name,last_name,age,position,number);
                granitList.add(playerGranit);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return granitList;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/telmanovo","root","11111111");
    }
}
