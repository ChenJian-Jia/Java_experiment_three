package cn.itcast.experiment.three;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        // 从键盘输入
        Scanner in =new Scanner(System.in);
        // 对老师进行实体化
        Teacher m = new Teacher(7,"玛卡巴卡","女","芭蕾舞","跳舞");
        Teacher h = new Teacher(11,"哈尼克孜","女","多郎舞","唱歌");
        Teacher d = new Teacher(8,"玛卡巴卡","女","赛娜姆","游泳");
        Teacher n = new Teacher(9,"那笛","女","来派尔","健身");
        // 对课程进行实例化
        Curriculum q=new Curriculum("CJ_72","芭蕾舞","教300","14:20",m);
        Curriculum w=new Curriculum("CJ_89","多郎舞","教207","9:40",h);
        Curriculum e=new Curriculum("CJ_13","赛乃姆","教100","7:50",d);
        Curriculum r=new Curriculum("CJ_96","来派尔","教104","1:30",n);
        Student s = new Student(12,"古力娜扎","女","做饭");
        // 打印课程信息
        System.out.println("课程信息：");
        System.out.println("*******************************************************************************************************************************************************");
        System.out.println("1号课程："+q);
        System.out.println("2号课程："+w);
        System.out.println("3号课程："+e);
        System.out.println("4号课程："+r);
        System.out.println("*******************************************************************************************************************************************************");
        // 学生选课
        System.out.println("请输入所选课程编号:");
        int i=in.nextInt();
        switch(i) {
            case 1:
                s.setCcc(q);
                break;
            case 2:
                s.setCcc(w);
                break;
            case 3:
                s.setCcc(e);
                break;
            case 4:
                s.setCcc(r);
                break;
            default:
                System.out.println("选课无效!");
                return;
        }
        System.out.println("您所选的课程是："+i+"号课程，您的选课信息如下：");
        System.out.println("*******************************************************************************************************************************************************");
        System.out.println(s);
        System.out.println("*******************************************************************************************************************************************************");
        // 学生退课
        System.out.println("是否退课：（是：1 否：2）");
        int x=in.nextInt();
        if(x==1) {
            s.setCcc(null);
            System.out.println("退课成功！");
            System.out.println(s);
        }
        else {
            System.out.println("选课结束!");
        }
        System.out.println("*********************************************************************************************************************************************************");
    }
}
