public class Section {
    private String name;
    private int currentSize;
    private Student[] st = new Student[50];

    public Section(Teacher teacher, String name) {
        this.teacher = teacher;
        Student[] st  = new Student[50];
        this.name = name;
        this.currentSize = currentSize;
    }
    private Teacher teacher;
    private Student[] student = new Student[50];
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Student[] getStudent() {
        return student;
    }
    public void setStudent(Student[] student) {
        this.student = student;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCurrentSize() {
        return currentSize;
    }
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
    public String toString(){
        String n = "";
        for(int i = 0; i<student.length;i++){
            if(student[i]!=null) {
                n = n + " " + student[i].getName();
            }
        }
        String x = "This " + name + " class is taught by " + teacher.getName() + " and has " + currentSize
                + " students:" + n;
        return x;
    }
    public void addStudent(Student s){
        student[currentSize] = s;
        currentSize++;
    }
}
//    public void addSchool(Section s){
//        ss[sectionCount] = s;
//        sectionCount++;
//    }


