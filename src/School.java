public class School {
    private String name;
    private Section[] sec = new Section[200];
    private int sCount = 0;

    public School(String name) {
        this.name = name;
//        this.sec = sec;
//        this.sCount = sCount;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String nm) {
        this.name = nm;
    }
    public void addSection(Section s) {
        this.sec[sCount] = s;
        sCount ++;
    }
    public Section[] getSections() {
        return this.sec;
    }
}
