public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("; хитрость: " + cunning + "; решительность: " + determination
                + "; амбициознасть: " + ambition + "; находчивость: " + resourcefulness
                + "; властолюбие: " + lustForPower);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int score1 = student1.ambition + student1.lustForPower + student1.cunning + student1.resourcefulness + student1.determination;
        int score2 = student2.ambition + student2.lustForPower + student2.cunning + student2.resourcefulness + student2.determination;
        if (student1 != null && student2 != null) {
            if (score1 > score2) {
                System.out.println(student1.getName() + " - лучший Слизеринец, чем " + student2.getName());
            } else {
                System.out.println(student2.getName() + " - лучший Слизеринец, чем " + student1.getName());
            }
        }
    }
}
