package cn.itcast.experiment.three;

public class Person {
    int ID;
    String name;
    String sex;
    Person(int ID,String name,String sex ) {
        setID(ID);
        setName(name);
        setSex(sex);
    }
    Person(){

    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
