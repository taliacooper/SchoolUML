public class Student extends Person{
    private int grade;
    private String name;
    Section[] ss= new Section[10];
    int sectionCount = 0;
    public Student (int grade, int id, String name){
        super(name, id);
        this.grade = grade;
    }
    public void addSection(Section s){
        ss[sectionCount] = s;
        sectionCount++;
    }
}