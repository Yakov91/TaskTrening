
public class Animal  implements AnimalSays {
    @Override
    public String speak() {
        String speak = "Animal speak...";
        return speak;
    }
    public String eat() {
        String eat = "Dog is eating...";
        return eat;
    }
}
