package JavaProgram;

@FunctionalInterface
interface Calculation{
    int add(int a, int b);
    static void print1(){
        System.out.println("Hello1..........");

    }
    default void print(){
        System.out.println("Hello..........");

    }}

public class Lecture34{
    public static void main(String[] args) {

        Calculation C = (a,b) -> a + b;
        System.out.println(C.add(34,43));
        C.print();
        Calculation.print1();

    }
}
