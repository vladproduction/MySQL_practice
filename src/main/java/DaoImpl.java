import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao{
//    @Override
//    public void create(Person p) {
//        Connection c = null;
//        try{
//            c=getConnection();
//            Statement st = c.createStatement();
//            //st.execute("insert into person (name, age) values ('test' , 22)");
//            st.execute("insert into person (name, age) values ('"+p.getName()+"' , "+p.getAge()+")");
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            try {
//                if(c!=null){
//                    c.close();
//                }
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    @Override
    public void create(Person p) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("insert into person (name, age) values (? , ?)");
            ps.setString(1,p.getName());
            ps.setInt(2,p.getAge());
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> readAll() {
        List<Person> persons = new ArrayList();
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("select * from person");

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                Person p = new Person(id,name,age);
                persons.add(p);
            }
            return persons;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Person current, Person candidate) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void removeAll() {

    }
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","11111111");
    }
}
