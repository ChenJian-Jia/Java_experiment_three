package cn.itcast.experiment.three;

public class Student extends Person {
    private String selected_course;
    private static int idCounter=0;
    private Curriculum ccc;
    Student(int ID,String name,String sex){
        super(ID,name,sex);
        this.ID = ++idCounter;
    }

    public Curriculum getCcc() {
        return ccc;
    }

    public void setCcc(Curriculum ccc) {
        this.ccc = ccc;
    }

    public String getSelected_course() {
        return selected_course;
    }

    public void setSelected_course(String selected_course) {
        this.selected_course = selected_course;
    }


    public String toString(){
        return "编号:"+ID+",姓名:"+name+","+"所选课程信息为："+ccc;
    }
}
