public class Chicken extends Animal implements Edible {
    @Override
    String makeSound() {
        return "chip-chip";
    }

    @Override
    public String howtoEat() {
        return "burn";
    }
}
