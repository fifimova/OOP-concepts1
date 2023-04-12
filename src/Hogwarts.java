public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void printDescription() {
        System.out.print(name + "; сила магии: " + magicPower
                + "; расстояние трасгресии: " + transgressionDistance);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public static void compareAnyStudents(Hogwarts student1, Hogwarts student2) {
        int score1 = student1.magicPower + student1.transgressionDistance;
        int score2 = student2.magicPower + student2.transgressionDistance;
        if (student1 != null && student2 != null) {
            if (score1 > score2) {
                System.out.println("По силе магии и величине расстояния трансгресии "
                        + student1.name + " выигрывает " + student2.name);
            } else {
                System.out.println("По силе магии и величине расстояния трансгресии "
                        + student2.name + " выигрывает " + student1.name);
            }
        }
    }
}
