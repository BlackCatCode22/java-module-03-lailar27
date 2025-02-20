// Animal.java
// lR 2/20/25

package myanimals;

public class Animal {
    public static void main(String[] args) {
        System.out.println("To begin, there are " + Cat.getCatCount()+ " cats.");

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Darth";
        myCat.age = 6;
        System.out.println("The new cat's name is " +myCat.name+ ", he is " +myCat.age+ " years old.");
        System.out.println(myCat.name+ " has " +Cat.MAX_LIVES+ " lives.");
        System.out.println("Because of " +myCat.name+ ", the new addition, there is now " +Cat.getCatCount()+ " cat.");


        System.out.println("To begin, there are " +Dog.getDogCount()+ " dogs.");

        Dog myDog = new Dog();
        myDog.bark();
        myDog.name = "Ewok";
        myDog.age = 10;
        System.out.println("The new dog's name is " +myDog.name+ ", he is " +myDog.age+ " years old.");
        System.out.println("Because of " +myDog.name+ ", the new addition, there is now " +Dog.getDogCount()+ " dog.");

        String animalAmount;
        animalAmount = String.valueOf (Dog.getDogCount() + Cat.getCatCount());
        System.out.println("Including both cats and dogs, there are now " +animalAmount+ " animals." );
    }
}