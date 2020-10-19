package cn.itcast.experiment.three;
import java.util.HashSet;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int u;
//        Set<Student> a = new HashSet<Student>();//Datatype为你所需要的数据类型
//        Student sti[] = new Student[3];
//        HashSet<Student> hashSet = new HashSet<Student>();
        HashSet<Student> names = new HashSet<Student>();//创建HashMap集合对象

        // 从键盘输入
        Scanner in = new Scanner(System.in);
        // 对老师进行实体化
        Teacher m = new Teacher(7, "玛卡巴卡", "女", "跳舞");
        Teacher h = new Teacher(11, "哈尼克孜", "女", "唱歌");
        Teacher d = new Teacher(8, "依古比古", "女", "游泳");
        Teacher n = new Teacher(9, "那笛", "女", "健身");

        // 对课程进行实例化
        Curriculum q = new Curriculum("CJ_72", "芭蕾舞", "教300", "14:20");
        q.setTeacher_course_taught(m);
        Curriculum w = new Curriculum("CJ_89", "多郎舞", "教207", "9:40");
        w.setTeacher_course_taught(h);
        Curriculum e = new Curriculum("CJ_13", "赛乃姆", "教100", "7:50");
        e.setTeacher_course_taught(d);
        Curriculum r = new Curriculum("CJ_96", "来派尔", "教104", "1:30");
        r.setTeacher_course_taught(n);

        Student s = new Student(12, "古力娜扎", "女", "做饭");
        Student t = new Student(19, "易建联", "男", "打球");
        Student b = new Student(19, "姚明", "男", "打球");
        // 修改课程与老师的对应关系
        System.out.println("******");
        // 打印课程信息
        System.out.println("课程信息：");
        System.out.println("*******************************************************************************************************************************************************");
        System.out.println("1号课程：" + q);
        System.out.println("2号课程：" + w);
        System.out.println("3号课程：" + e);
        System.out.println("4号课程：" + r);
        System.out.println("*******************************************************************************************************************************************************");
        // 学生选课
        System.out.println("请输入所选课程编号:");
        Student[] s1 = {s, t, b};
        for (Student str : s1) {
            int i = in.nextInt();
            System.out.println("请下一个同学选课");
            switch (i) {
                case 1:
                    str.setCcc(q);
                    System.out.println("你选的是第一个的课程");
                    System.out.println("您的信息为");
                    System.out.println(str);
                    names.add(str);
                    break;
                case 2:
                    str.setCcc(w);
                    System.out.println("你选的是第二个的课程");
                    System.out.println("您的信息为");
                    System.out.println(str);
                    names.add(str);
                    break;
                case 3:
                    System.out.println("你选的是第三个的课程");
                    System.out.println("您的信息为");
                    str.setCcc(e);
                    System.out.println(str);
                    names.add(str);
                    // 另一种打印
                    //System.out.println("88"+names+"11111");
                    break;
                case 4:
                    System.out.println("你选的是第四个课程的课程");
                    System.out.println("您的信息为");
                    str.setCcc(r);
                    System.out.println(str);
                    names.add(str);
                    break;
                default:
                    System.out.println("选课无效!");
                    return;
            }
        }

        System.out.println("打印课程列表");
        for (Object object : names) {
            System.out.println(object);
        }
        System.out.println("\n----------------------");

        System.out.println("退课开始！！！");
        System.out.println("是否退课：（是：1 否：2）");
        Student[] s2 = {s, t, b};
        for (Student str : s1) {
            int x = in.nextInt();
            if (x == 1) {
                str.setCcc(null);
                names.remove(str);
                System.out.println("退课成功！");
                System.out.println(str);
                //sti[]=null;
            } else {
                System.out.println("退课结束!");
            }
        }
        System.out.println("打印课程列表2");
        for (Object object : names) {
            System.out.println(object);
        }
        System.out.println("\n----------------------");
    }
    }




