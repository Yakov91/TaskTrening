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
        System.out.println(animal2.speak());
        System.out.println(animal2.eat());
    }
}