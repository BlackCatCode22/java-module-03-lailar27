// Driver.java
// lR 2/20/25

public class Driver {
    public static void main(String [] args){

        MyStuff myStuff = new MyStuff();
        myStuff.bottleType = "metal";
        myStuff.color = "blue";
        myStuff.ouncesHeld = 24; String o = "oz.";
        myStuff.weight = 1; String w = "lb";
        myStuff.containsStraw = true;

        System.out.println("My water bottle is made out of " +myStuff.bottleType);
    }

}