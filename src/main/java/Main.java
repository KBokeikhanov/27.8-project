public class Main {
    public static void main(String[] args) {
        University university = new University("IT", "IT University", "ITU", 2009, StudyProfile.DEVELOPER);
        Student student = new Student("Abdulov Malik", "IT", 1, 24);
        System.out.println(university);
        System.out.println(student);
    }
}
