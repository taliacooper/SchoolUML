public class Teacher extends Person {
    private String subject;
    private int sectionCount;
    private Section[] ss = new Section[10];
    public Teacher (String name, String subject, int id) {
        super(name, id);
        this.subject = subject;
        this.sectionCount = 0;
    }


    public Section[] getSs() {
        return ss;
    }
    public void setSs(Section[] ss) {
        this.ss = ss;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getSectionCount() {
        return this.sectionCount;
    }
    public void setSectionCount(int id) {
        this.sectionCount = id;
    }
    public void addSection(Section s ){
        ss[sectionCount] = s;
        sectionCount++;
    }
}
