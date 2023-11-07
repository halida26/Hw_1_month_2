public class Daughter extends Mother {
    private String hobby;

    public Daughter(int age, String name, Busyness busyness,
                    String car,House house, String hobby) {
        super(age, name, busyness, car,house);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }


    @Override
    public void Work(String working) {
        super.Work(working);
        System.out.println("Перезапись.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nHobby: " + hobby;

    }
}
