import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dao dao = new DaoImpl();

        //working with create(Player p) method
        //Player player1 = new Player(1,"Player1","play",15,"midfielder");
//        Player player2 = new Player(5,"Kola","Belchik",20,"defender");
//        Player player3 = new Player(6,"Max","Erohi",21,"midfielder");
//        dao.create(player1);
//        dao.create(player2);
//        dao.create(player3);


//-----------------------------------------------------------------------------------------------------
        //working with readAll() method
//        List<Player> players = dao.readAll();
//        for (int i = 0; i < players.size(); i++) {
//            Player player = players.get(i);
//            System.out.println(player);
//        }

//------------------------------------------------------------------------------------------------------
//        //working with update(current,candidate) method
//        Player current = new Player(1,"victor","vvv",23,"striker");
//        //dao.create(current);   //first we create
//        Player candidate = new Player(1,"Victor","Vasil",22,"forward");
//        //dao.update(current,candidate);   //after it has been created, comment and use update method

//------------------------------------------------------------------------------------------------------
                //working with remove(int id) method
                //just create some new players in table twice
//        Player p1 = new Player(1,"P1","p1",15,"midfielder");
//        Player p2 = new Player(1,"P2","p2",16,"midfielder");
//        dao.create(p1);     //comment so it does not create again
//        dao.create(p2);     //comment so it does not create again
//                //let`s see if they are in table
//        List<Player> players = dao.readAll();
//        for (int i = 0; i < players.size(); i++) {
//            Player player = players.get(i);
//            System.out.println(player);
////        }
//        dao.remove(9);
//        dao.remove(10);
        //let`s see if they are in table (after deleting)
//        List<Player> players = dao.readAll();
//        for (int i = 0; i < players.size(); i++) {
//            Player player = players.get(i);
//            System.out.println(player);
//        }
                //table changed

// ------------------------------------------------------------------------------------------------
                //working with removeAll() method
            dao.removeAll(); //all items have been deleted






    }
}
