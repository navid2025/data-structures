package main.java.org.navid.array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.remove(2);
//        System.out.println(array.max());
//        System.out.println("**************");
//        int[] test = {10,20,100,200};
//        array.intersect(test).print();
//        System.out.println("*************");
        array.print();
        System.out.println("*************");
//        array.reverse();
//        array.print();
        array.insertAt(10, 0);
        array.print();
    }
}
