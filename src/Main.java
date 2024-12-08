public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Animal animal = new Animal();
        System.out.println(animal.speak());

        System.out.println();

        Animal animal1 = new Leo();
        System.out.println(animal1.speak());

        System.out.println();

        Animal animal2 = new Dog();
        Dog dog = new Dog();
        System.out.println(animal2.speak());
        System.out.println(animal2.eat());
        System.out.println(dog.eat());

        System.out.println();
        Cow cow = new Cow();
        System.out.println(cow.speak());
        System.out.println(cow.eat());

        System.out.println();
        Duck duck = new Duck();
        System.out.println(duck.speak());
    }
}