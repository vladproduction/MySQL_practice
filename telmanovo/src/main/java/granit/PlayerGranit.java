package granit;

public class PlayerGranit {
    private int id;
    private String name;
    private String last_name;
    private int age;
    private String position;
    private int number;

    public PlayerGranit(int id, String name, String last_name, int age, String position, int number) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.position = position;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\tGranit:" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", number=" + number;
    }
}
