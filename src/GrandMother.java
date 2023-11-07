public class GrandMother {
    private int age;
    private String name;
    private Busyness busyness;
    private House house;

    public GrandMother(int age, String name, Busyness busyness, House house) {
        this.age = age;
        this.name = name;
        this.busyness = busyness;
        this.house = house;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Busyness getBusyness() {
        return busyness;
    }

    public House getHouse() {
        return house;
    }

    public String getInfo() {
        return "Age " + age +
                "\nName" + name +
                "\nBusyness" + "\nHouse: " +
                house.getAddress() + house.getRegion();
    }
}
