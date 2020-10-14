package cn.itcast.experiment.three;

public class Teacher extends Person{
    private String courses_taught;
    private String hobby;
    private Curriculum ct;
    Teacher(int ID,String name,String sex,String courses_taught,String hobby){
        super(ID,name,sex);
        setCourses_taught(courses_taught);
        setHobby(hobby);
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Curriculum getCt() {
        return ct;
    }

    public void setCt(Curriculum ct) {
        this.ct = ct;
    }

    public String getCourses_taught() {
        return courses_taught;
    }

    public void setCourses_taught(String courses_taught) {
        this.courses_taught = courses_taught;
    }
    public String toString(){
        return "["+"编号:"+ID+",姓名:"+name+"，性别："+sex+",爱好:"+hobby+",所教课程:"+courses_taught+"]";
    }
}
