public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int fidelity;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance,
                      int industriousness, int fidelity, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("; трудолюбие: " + industriousness
                + "; верность: " + fidelity + "; честность: " + honesty);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int score1 = student1.industriousness + student1.fidelity + student1.honesty;
        int score2 = student2.industriousness + student2.fidelity + student2.honesty;
        if (student1 != null && student2 != null) {
            if (score1 > score2) {
                System.out.println(student1.getName() + " - лучший Пуффендуец, чем " + student2.getName());
            } else {
                System.out.println(student2.getName() + " - лучший Пуффендуец, чем " + student1.getName());
            }
        }
    }
}
