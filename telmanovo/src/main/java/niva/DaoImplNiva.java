package niva;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImplNiva implements DaoNiva{
    @Override
    public void create(PlayerNiva pn) {
        try (Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("insert into niva (name, last_name, age, position, number)" +
                    "values (?,?,?,?,?)");
            ps.setString(1,pn.getName());
            ps.setString(2, pn.getLast_name());
            ps.setInt(3,pn.getAge());
            ps.setString(4,pn.getPosition());
            ps.setInt(5,pn.getNumber());
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();

        }

    }

    @Override
    public List<PlayerNiva> readAll() {
        List<PlayerNiva> nivaList = new ArrayList();
        try (Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("select * from telmanovo.niva");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String last_name = rs.getString("last_name");
                int age = rs.getInt("age");
                String position = rs.getString("position");
                int number = rs.getInt("number");
                PlayerNiva playerNiva = new PlayerNiva(id,name,last_name,age,position,number);
                nivaList.add(playerNiva);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return nivaList;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/telmanovo","root","11111111");
    }
}
