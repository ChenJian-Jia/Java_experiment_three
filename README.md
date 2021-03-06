# Java_experiment_three
计191 贾忱健 2019310177 实验三 面向对象编程之学生选课模拟系统
# 一、实验目的：
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
掌握面向对象的类设计方法(属性、方法)；  
掌握类的继承用法，通过构造方法实例化对象；  
学会使用super()，用于实例化子类；  
掌握使用Object根类的toString()方法,应用在相关对象的信息输出中。  
# 二、业务要求：
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	
人员（编号：、姓名：、性别：、爱好：）  
教师（编号：7、姓名：玛卡巴卡、性别：女、所授课程：芭蕾舞、爱好：跳舞）  
教师（编号：11、姓名：哈尼克孜、性别：女、所授课程：多郎舞、爱好：唱歌）  
教师（编号：8、姓名：依古比古、性别：女、所授课程：赛乃姆、爱好：游泳）  
教师（编号：9、姓名：那笛、性别：女、所授课程：来派尔、爱好：健身）  
学生1（编号1：、姓名：古力娜扎、性别：女、爱好：做饭）  
学生2（编号2：、姓名：易建联、性别：男、爱好：打球）  
学生3（编号3：、姓名：姚明、性别：男、爱好：打球）  
课程（编号：CJ-72、课程名称：芭蕾舞、上课地点:教300、时间：14：20、授课教师：玛卡巴卡）  
课程（编号：CJ-89、课程名称：多郎舞、上课地点：教207、时间：9：40、授课教师：哈尼克孜）  
课程（编号：CJ-13、课程名称：赛乃姆、上课地点：教100、时间：7：50、授课教师：依古比古）  
课程（编号：CJ-96、课程名称：来派尔、上课地点：教104、时间：1：30、授课教师：那笛）
# 三、实验要求：
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。  
3.（要求有实验目的、要求、过程、流程图、核心代码、注释、系统运行截图、编程感想等，分章节罗列，不能在实验报告中粘帖大段代码）  
# 四、解题思路：
第一步：根据题目要求”人员“，分为“教师”和“学生”，可知人员类是教师类和学生类的父类，教师类和学生类要继承教师类；  
第二步：创建出Person类，在类中创建成员变量，创造接收参数的构造方法并对成员变量进行get和set方法；  
第三步：在Student中创建一些基本的成员不包括Person类中有的，创建构造方法在其中调用get和set方法，在最后对toString方法进行覆盖；  
第四步：在Teacher中创建一些基本的成员不包括Person类中有的，创建构造方法在其中调用get和set方法，在最后对toString方法进行覆盖；  
第五步：创建Curriculum类，设计基本变量，包括Teacher类创建变量，在创建构造方法，在其中调用设置方法，在最后对toString方法进行覆盖；  
第六步：创建Test类，对多个类进行实体化，设置开关语句和HashSet来实现选课退课;  
# 五、操作过程：
（1）Student继承了Person类，所以Student类中不需要在创建ID、name和sex的成员变量，创建静态idCounter变量，创建hobby变量和创建课程类的ccc变量。创建构造方法接收ID、name、sex和hobby参数。  
（2）在Student中的构造方法中用super调用父类Person的构造方法，Student的构造方法接收的ID、name和sex参数给super接收参数，设置ID等于id.Counter当用学生类创建多个学生对象时可以自动给这些对象的编号进行顺序赋值。  
（3）在Student中的构造方法中调用set方法设置hobby，在Stundent类中对toString方法进行覆盖，使其返回Stundent类中的ID、name、hobby和ccc变量。  
（4）用Student创造的对象选什么课程都由Curriculum类的ccc变量控制，可以在Test类中调用Student中的setCcc方法来设置Student中的ccc变量，在toString中返回ccc变量，这就是实现了打印对象直接返回所选的课程信息和对象基本信息。  
（5）Teacher继承了Person类，所以Teacher类中不需要在创建ID、name和sex的成员变量，创建hobby变量。创建构造方法接收ID、name、sex和hobby参数。  
（6）在Teacher中的构造方法中用super调用父类Person的构造方法，Teacher的构造方法接收的ID、name和sex参数给super接收参数，接收的所教授的课程的参数赋给setCourses_taught函数。  
（7）在Teacher中的构造方法中调用set方法设置hobby，在Teacher类中对toString方法进行覆盖，使其返回Teacher类中的ID、name、hobby和caourses_taught变量。  
（8）因为一个老师只能教授一个课程所以不需要对Teacher类中的courses_taught变量在Test类在进行set操作，所以在Teacher类中的构造方法中调用setCourses_taught方法和setHobby方法对变量赋值。  
（9）因为一个课程只有一个老师教授，所以在Test中对课程实体化的时候，需要加入老师的信息，于是创建Teacher类变量teacher_course_taught，用来接收老师的信息。  
（10）创建Curriculum类中的常规变量ID、course_title和schooltime变量。  
（11）创建Curriculum类中的构造方法，接受ID、course_title、place_class、schooltime和Teacher类的teacher_courses参数。在构造方法中调用这些变量的set方法。  
（12）创建Curriculum类的toString覆盖Object类的toString方法，在方法中返回这些变量的信息，这就实现了在Test中打印Curriculum类的对象时直接返回return后的信息。  
（13）在Test中导入Scanner包，用于接受从键盘输入的信息并在main中用Scanner创建in对象，用in.nextInt()实现从前读入整型数。  
（14）用Teacher创造多个教师信息实体对象，用Curriculum创造多个课程信息实体对象。  
（15）因为Curriculum的构造方法可以接受Teacher类的参数，将创建好的Teacher类对象作为参数用于Curriculum创造对象，这实现了，课程信息和老师信息的绑定。这不仅仅显示了课程的信息，也显示了老师的信息。  
（16）用打印语句对课程信息进行打印，因为在Curriculum类中覆写了toString方法，直接打印Curriculum创造的对象，就实现了打印课程信息，而Curriculum创造的对象中包含Teacher类创造的对象的信息，所以直接打印Curriculum类创造的对象就可以显示很全面的课程的信息。  
（17）用打印语句来控制提示语句和分割符，是运行结果看起来更加清晰。  
（18）创建Student类的数组用于存放Student类的对象，通过for来循环遍历Student类的数组对象。  
（19）利用开关语句switch接收参数i，i是从键盘输入的值，case中放置Student类创建的对象的set方法，因为Student类中的有Curriculum类型的变量ccc，在case中直接调用Student类数组中的对象set方法这就实现了选课。当i的值没有case与之对应是则执行default语句打印提示信息。  
（20）通过HashSet来将已经选完课的Student类的对象进行储存。  
（21）选完课后用for来遍历names集合中的Object数据类型的元素，这就实现了打印课表信息，不管是选择哪一门课程都可以打印出三个Student类的信息。    
（22）退课时直接将Student类的对象的课程set函数接收null，并利用HashSet对象的remove方法直接移除Student类的对象。  
（23）用return语句来控制程序的结束，避免打印提示信息之后还会执行下边的程序。    
（24）因为Student中覆写了toString方法，所以直接打印Student类创建的对象就可以显示toString方法中return后边的信息，实现了选课之后打印学生信息。    
（25）打印提示信息来提示是否退课，用in.nextInt的方法获取x值，再利用if语句来实现退课，当x等于1时，执行Student类对象的set方法，赋值为“null”就实现了退课。退课时直接将Student类的对象的课程set函数接收null，并利用HashSet对象的remove方法直接移除Student类的对象。再次利用for循环遍历names集合打印其中的元素，实现了退课之后打印学生信息。    
# 六、核心代码：  
1.Student类中的Crurriculum类型的ccc变量和Student的构造方法的定义：
```
private Curriculum ccc;
Student(int ID,String name,String sex,String hobby){
        super(ID,name,sex);
        this.ID = ++idCounter;
        setHobby(hobby);
    }
```
2.Student类中的toString方法的定义：
```
public String toString(){
        return "["+"编号:"+ID+",姓名:"+name+","+"爱好:"+hobby+"]"+" 所选课程信息为："+ccc;
    }
```
3.Person类中的构造方法的定义:
```
Person(int ID,String name,String sex ) {
        setID(ID);
        setName(name);
        setSex(sex);
    }
```
4.Teacher类的构造方法的定义:
```
Teacher(int ID,String name,String sex,String hobby){
        super(ID,name,sex);
        setCourses_taught(courses_taught);
        setHobby(hobby);
        setCt(ct);
    }
```
5.Curriculum类中的Teacher类型的teacher_course_taught变量和Curriculum的构造方法的定义：
```
Teacher teacher_course_taught;
    Curriculum(String ID,String course_title,String place_class,String schooltime){
        setID(ID);
        setCourse_title(course_title);
        setPlace_class(place_class);
        setSchooltime(schooltime);
        setTeacher_course_taught(teacher_course_taught);
    }
```
6.Curriculum类中的toString方法的定义：
```
public String toString(){
        return "课程号："+ID+",课程名称:"+course_title+",上课地点:"+place_class+",教学时间:"+schooltime+",授课教师信息为:"+teacher_course_taught;
    }
```
7.Test测试类中Teacher和Curriculum类的对象实体化：
```
Teacher m = new Teacher(7, "玛卡巴卡", "女", "跳舞");
Curriculum q = new Curriculum("CJ_72", "芭蕾舞", "教300", "14:20");
        q.setTeacher_course_taught(m);
```
8.Test测试类中的选课功能的实现：
```
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
                default:
                    System.out.println("选课无效!");
                    return;
            }
        }

```
9.Test类中的退课功能的实现：
```
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
```
10.打印选课信息列表功能的实现：
```
System.out.println("打印课程列表2");
        for (Object object : names) {
            System.out.println(object);
        }
        System.out.println("\n----------------------");
```
# 七、流程图  
![img_3](https://github.com/ChenJian-Jia/Java_experiment_three/blob/main/img/%E6%94%B9%E8%BF%9B%E8%BF%87%E5%90%8E%E7%9A%84%E4%BB%A3%E7%A0%81%E7%9A%84%E6%B5%81%E7%A8%8B%E5%9B%BE.png)  
# 八、实验结果：
实验结果一图片：  
![img_1](https://github.com/ChenJian-Jia/Java_experiment_three/blob/main/img/%E6%94%B9%E8%BF%9B%E8%BF%87%E5%90%8E%E7%9A%84%E4%BB%A3%E7%A0%81%E7%9A%84%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C%E5%9B%BE%E7%89%87%E4%B8%80.png)  
实验结果二图片：  
![img_2](https://github.com/ChenJian-Jia/Java_experiment_three/blob/main/img/%E6%94%B9%E8%BF%9B%E8%BF%87%E5%90%8E%E7%9A%84%E4%BB%A3%E7%A0%81%E7%9A%84%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C%E5%9B%BE%E7%89%87%E4%BA%8C.png)  
# 九、实验感想：  
本次实验初步了解了系统需求，从学生选课的角度了解系统的实体及其关系，掌握面向对象类的设计方法（属性、方法），掌握了类的继承用法，通过构造方法实例化对象，学会了使用super（），用于实体化子类和掌握了使用Object跟类的toString方法，应用在相关的对象的信息输出。在这次实验中用了两个都来继承一个类，这体现了一个子类只能继承一个父类，但是一个父类可以有多个子类的思想。在这次实验中利用了super方法，用于引用父类对象。关键字“super”以继承的概念出现在类中。减少了子类的代码量并帮助实现了类的继承。如何是各个类链接起来是困扰我很久的问题，解决思想就是我已经创建好了Curriculum、Student和Teacher类了，那么我就可以利用这些类在其他类中创建该类的对象，再在其他类中的构造方法中设置这些类型的参数，这就实现了多个类的链接。如何实现对象的所有信息的全部打印，用toString放法的覆写，覆盖了Object根类的toString方法，在toString中return 所需的课程信息，但这里有要注意toString方法是String类型的，所以在返回的时候要以字符串类型的，可以加“”来实现转化为字符串输出。在Test中实体化对象时，直接调用构造方法时加入其他类的对象，实现了各个类联动。通过创建Student类的数组来循环进行选课退课操作。巩固了switch的方法。退课的操作方法也困扰我一段时间，当我想起来C语言课设的时候，就是赋值null或者用循环覆盖来实现，在这里了我用了null赋值方法。因为要实现打印课程列表的功能，不会操作询问了老师，老师给了我用HashSet的方法，我通过查询资料，掌握了一些基本操作，可以通过HashSet的对象.add的方式来储存，通过对象.remove的方式来移除元素，这就是实现了课程列表的打印。这次实验难度有点大，主要难度是在于如何实现各个类的联动，这个思想还是给我很大冲击的，还有如何进行选课退课的操作，总之这次课程对于我学习类与对象提供了很大的帮助还有一些编程的思想同时这也给了我很大的信心。
