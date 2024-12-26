package Oct.ex_10152024;

public class Dog {
    // Attributes
    String name;
    String breed;
    String color;
    int age;

    // Constructor
    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    // Behaviour
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void play() {
        System.out.println(name + " is playing");
    }

    // Main method
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy", "Golden Retriever", "Golden", 3);

        // Call methods
        myDog.sleep();
        myDog.bark();
        myDog.play();
    }
}
