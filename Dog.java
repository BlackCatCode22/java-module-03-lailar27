// Cat.java
// lR 2/20/25

package myanimals;

public class Dog {

    private static int dogCount = 0;
    String name;
    int age;

    public void bark(){
        System.out.println("Woof");
    }


    public Dog (){
        dogCount++;
    }

    public static int getDogCount(){
        return dogCount;
    }
}
