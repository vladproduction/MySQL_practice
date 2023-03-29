public class Player {
    private int id_player;
    private String name;
    private String last_name;
    private int age;
    private String position;

    public Player(int id_player, String name, String last_name, int age, String position) {
        this.id_player = id_player;
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.position = position;
    }

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id_player=" + id_player +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
