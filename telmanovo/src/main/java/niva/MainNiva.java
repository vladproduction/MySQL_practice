package niva;

import java.util.List;

public class MainNiva {
    public static void main(String[] args) {
        PlayerNiva playerNiva1 = new PlayerNiva(1,"Den","Ermak",23,"goalkeeper",1);
        PlayerNiva playerNiva2 = new PlayerNiva(2,"Dim","Pavle",34,"defender",2);
        PlayerNiva playerNiva3 = new PlayerNiva(3,"Alex","Deman",29,"defender",3);
        PlayerNiva playerNiva4 = new PlayerNiva(4,"San","Gernov",41,"defender",4);
        PlayerNiva playerNiva5 = new PlayerNiva(5,"Gesha","Viligur",37,"defender",5);
        PlayerNiva playerNiva6 = new PlayerNiva(6,"Dmitr","Sot",21,"defender",6);
        PlayerNiva playerNiva7 = new PlayerNiva(7,"Kotja","Cheba",34,"midfielder",7);
        PlayerNiva playerNiva8 = new PlayerNiva(8,"Kol","Podoljach",26,"midfielder",8);
        PlayerNiva playerNiva9 = new PlayerNiva(9,"Lexa","Sinjak",29,"midfielder",9);
        PlayerNiva playerNiva10 = new PlayerNiva(10,"Vladim","Nusha",37,"midfielder",10);
        PlayerNiva playerNiva11 = new PlayerNiva(11,"Victor","Vasil",22,"striker",11);
        PlayerNiva playerNiva12 = new PlayerNiva(12,"Ser","Terega",23,"goalkeeper",12);
        PlayerNiva playerNiva13 = new PlayerNiva(13,"Alex","Regyk",35,"defender",13);
        PlayerNiva playerNiva14 = new PlayerNiva(14,"Dmit","Fedos",23,"midfielder",14);
        PlayerNiva playerNiva15 = new PlayerNiva(15,"Igor","Cheban",37,"striker",15);

        DaoImplNiva daoImplNiva = new DaoImplNiva();

        daoImplNiva.create(playerNiva1);
        daoImplNiva.create(playerNiva2);
        daoImplNiva.create(playerNiva3);
        daoImplNiva.create(playerNiva4);
        daoImplNiva.create(playerNiva5);
        daoImplNiva.create(playerNiva6);
        daoImplNiva.create(playerNiva7);
        daoImplNiva.create(playerNiva8);
        daoImplNiva.create(playerNiva9);
        daoImplNiva.create(playerNiva10);
        daoImplNiva.create(playerNiva11);
        daoImplNiva.create(playerNiva12);
        daoImplNiva.create(playerNiva13);
        daoImplNiva.create(playerNiva14);
        daoImplNiva.create(playerNiva15);

        List<PlayerNiva> nivaPlayersList = daoImplNiva.readAll();
        for (int i = 0; i < nivaPlayersList.size(); i++) {
            PlayerNiva playerNiva = nivaPlayersList.get(i);
            System.out.println(playerNiva);
        }
    }
}
