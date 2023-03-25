package granit;

public class MainGranit {
    public static void main(String[] args) {
        DaoGranit daoGranit = new DaoImplGranit();

        PlayerGranit playerGranit1 = new PlayerGranit(1,"Serg","Terega",22,"goalkeeper",1);
        PlayerGranit playerGranit2 = new PlayerGranit(2,"Den","Prokop",21,"defender",2);
        PlayerGranit playerGranit3 = new PlayerGranit(3,"Vital","Maxim",24,"defender",3);
        PlayerGranit playerGranit4 = new PlayerGranit(4,"Alex","Karach",22,"defender",4);
        PlayerGranit playerGranit5 = new PlayerGranit(5,"Kola","Belchik",20,"defender",5);
        PlayerGranit playerGranit6 = new PlayerGranit(6,"Max","Erohi",21,"midfielder",6);
        PlayerGranit playerGranit7 = new PlayerGranit(7,"Volod","Rusan",27,"midfielder",7);
        PlayerGranit playerGranit8 = new PlayerGranit(8,"Ivan","Rusak",20,"midfielder",8);
        PlayerGranit playerGranit9 = new PlayerGranit(9,"Vlad","Bogda",22,"midfielder",9);
        PlayerGranit playerGranit10 = new PlayerGranit(10,"Oleg","Barba",22,"midfielder",10);
        PlayerGranit playerGranit11 = new PlayerGranit(11,"Fedr","Murza",22,"forward",11);
        PlayerGranit playerGranit12 = new PlayerGranit(12,"Alex","Rusan",42,"goalkeeper",12);
        PlayerGranit playerGranit13 = new PlayerGranit(13,"Serg","Maxim",24,"defender",13);
        PlayerGranit playerGranit14 = new PlayerGranit(14,"Geka","Telenko",22,"midfielder",14);
        PlayerGranit playerGranit15 = new PlayerGranit(15,"Andr","Kushnir",22,"forward",15);

        daoGranit.create(playerGranit1);
        daoGranit.create(playerGranit2);
        daoGranit.create(playerGranit3);
        daoGranit.create(playerGranit4);
        daoGranit.create(playerGranit5);
        daoGranit.create(playerGranit6);
        daoGranit.create(playerGranit7);
        daoGranit.create(playerGranit8);
        daoGranit.create(playerGranit9);
        daoGranit.create(playerGranit10);
        daoGranit.create(playerGranit11);
        daoGranit.create(playerGranit12);
        daoGranit.create(playerGranit13);
        daoGranit.create(playerGranit14);
        daoGranit.create(playerGranit15);


    }
}
