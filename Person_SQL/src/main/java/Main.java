import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dao dao = new DaoImpl();
        Person person1 = new Person(1,"David",3);
        //dao.create(person1);
        List<Person> persons = dao.readAll();
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            System.out.println(p);
        }
    }
}
