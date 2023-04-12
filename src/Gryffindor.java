public class Gryffindor extends Hogwarts{
    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobleness, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("; благородство: " + nobleness
                + "; честь: " + honor + "; храбрость: " + bravery);
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        int score1 = student1.nobleness + student1.honor + student1.bravery;
        int score2 = student2.nobleness + student2.honor + student2.bravery;
        if (student1 != null && student2 != null) {
            if (score1 > score2) {
                System.out.println(student1.getName() + " - лучший Гриффиндорец, чем " + student2.getName());
            } else {
                System.out.println(student2.getName() + " - лучший Гриффиндорец, чем " + student1.getName());
            }
        }
    }
}

