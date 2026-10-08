package GrassCoachingClass.This;

 // 1. Using this to Refer to Current Class Instance Variables And Static Variables
public class Problem1 {
    int age = 24;
    static String name = "Sarthak sen";

    void test(){
        int age = 18;
        String name = "Hena";

        this.age = 31;
        this.name = "Garret";

        // we are using this keyword to distinguish the local and instance variable.
        // age = age;

        System.out.println("Instance Variable : " + this.age + " " + this.name);
        System.out.println("Local Variable : " + age + " " + name);
    }
    public static void main(String[] args) {

        Problem1 p1 = new Problem1();
        p1.test();
        System.out.println( p1.age);
        System.out.println(name);
    }
}
