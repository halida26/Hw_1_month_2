public class Main {
    public static void main(String[] args) {
        Mother objectA = new Mother(33, " Aichurok ",
                Busyness.WORK, " Lexus", new House("Baxa ", " Bishkek"));
        Daughter objectB = new Daughter(14, " Halida ",
                Busyness.STUDIES, "Mercedes ", new House("Тоголок.М ", " Bishkek"), "Dance");
        Daughter objectC = new Daughter(18, " Ayana ",
                Busyness.WORK, "BMW ", new House("Жибек.Ж ", " Bishkek"), " Model");
        System.out.println(objectA.getInfo());
        System.out.println("=======");
        System.out.println(objectB.getInfo());
        System.out.println("=======");
        System.out.println(objectB.getInfo());
        objectA.Work();
        objectA.Work("Development");
        objectA.Work(150);
        objectB.Work();
        objectB.Work("Student and study school number 2");
        objectC.Work();
        objectC.Work("Student and study school number 7");

    }
}