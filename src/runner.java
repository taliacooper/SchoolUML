public class runner {
    public static void main(String[] args) {

        School bhs = new School("Berkeley High");

        Teacher a = new Teacher("mueller", "biology", 1);
        Teacher b = new Teacher("Henri", "math", 2);
        Teacher c  = new Teacher("Albinson", "computer science", 3);

        Student talia = new Student(11, 4, "Talia");
        Student rayna = new Student(11, 5, "Rayna");
        Student solia = new Student(11, 6, "Solia");
        Student sammi = new Student(11, 7, "Sammi");
        Student rachel = new Student(11, 8, "Rachel");

        Section mat = new Section(b, "Math");
        Section bio = new Section(a, "Biology");
        Section com = new Section(c, "computer science");

        mat.addStudent(talia);
        bio.addStudent(rayna);
        com.addStudent(sammi);
        mat.addStudent(rachel);
        bio.addStudent(talia);
        bio.addStudent(rachel);

        System.out.println(bio.toString());
        System.out.println(mat.toString());
        System.out.println(com.toString());





    }
}
