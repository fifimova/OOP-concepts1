public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Potter", 50,10,50,99,3);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 100, 20, 3, 100, 30);
        Gryffindor ron = new Gryffindor("Ron Weasley", 1, 1, 70, 50, 1);

        Hufflepuff zacharias = new Hufflepuff("Zacharias Smith", 1, 80, 100, 1, 1);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 100, 100, 100, 100, 100);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 15, 66, 5, 77, 55);

        Ravenclaw zhou = new Ravenclaw("Zhou Chang", 22, 37, 27, 13, 31, 8);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 19, 54, 81, 33, 99, 1);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 11, 55, 17, 56, 25, 37);

        Slytherin draco = new Slytherin("Draco Malfoy", 89, 11, 100, 50, 50, 100, 100);
        Slytherin graham = new Slytherin("Graham Montagu", 45, 47, 3, 35, 8, 6, 1);
        Slytherin gregory = new Slytherin("Gregory Goyle", 11, 56, 54, 21, 4, 4, 99);

        harry.printDescription();
        cedric.printDescription();
        padma.printDescription();
        draco.printDescription();
        Gryffindor.compareStudents(harry,ron);
        Hufflepuff.compareStudents(zacharias, cedric);
        Ravenclaw.compareStudents(marcus, zhou);
        Slytherin.compareStudents(draco, graham);
        Hogwarts.compareAnyStudents(harry,draco);
    }
}