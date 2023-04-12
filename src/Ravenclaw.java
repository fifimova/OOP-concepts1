public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int magicPower, int transgressionDistance,
                     int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("; ум: " + mind + "; мудрость: " + wisdom
                + "; остроумие: " + wit + "; творчество: " + creation);
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int score1 = student1.creation + student1.mind + student1.wit + student1.wisdom;
        int score2 = student2.creation + student2.mind + student2.wit + student2.wisdom;
        if (student1 != null && student2 != null) {
            if (score1 > score2) {
                System.out.println(student1.getName() + " - лучший Когтевранец, чем " + student2.getName());
            } else {
                System.out.println(student2.getName() + " - лучший Когтевранец, чем " + student1.getName());
            }
        }
    }
}
