package refactoring_guru.BlockTest;
//代码块
public class BlockTest {
}

class Person{
    //属性
    String name;
    int age;
    static  String desc = "我是一个人";

    //构造器
    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    public String toString(){
        return "Person [name=" + name + ",age = " + age + "]";
    }

}
