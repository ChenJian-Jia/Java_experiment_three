package cn.itcast.experiment.three;

public class Curriculum {
    String ID;
    String course_title;
    String place_class;
    String schooltime;
    Teacher teacher_course_taught;
    Curriculum(String ID,String course_title,String place_class,String schooltime){
        setID(ID);
        setCourse_title(course_title);
        setPlace_class(place_class);
        setSchooltime(schooltime);
        setTeacher_course_taught(teacher_course_taught);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getPlace_class() {
        return place_class;
    }

    public void setPlace_class(String place_class) {
        this.place_class = place_class;
    }

    public String getSchooltime() {
        return schooltime;
    }

    public void setSchooltime(String schooltime) {
        this.schooltime = schooltime;
    }

    public Teacher getTeacher_course_taught() {
        return teacher_course_taught;
    }

    public void setTeacher_course_taught(Teacher teacher_course_taught) {
        this.teacher_course_taught = teacher_course_taught;
    }
    public String toString(){
        return "课程号："+ID+",课程名称:"+course_title+",上课地点:"+place_class+",教学时间:"+schooltime+",授课教师信息为:"+teacher_course_taught;
    }
}

