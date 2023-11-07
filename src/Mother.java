public class Mother extends GrandMother {
    private String car;

    public Mother(int age, String name, Busyness busyness, String car, House house) {
        super(age, name, busyness, house);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void Work() {
        System.out.println("Development");
    }

    public void Work(String working) {
        System.out.println(Busyness.WORK);
    }

    public final void Work(int speedCar) {
        System.out.println("Скорость машины: " + speedCar);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nCar:" + car;
    }
}
