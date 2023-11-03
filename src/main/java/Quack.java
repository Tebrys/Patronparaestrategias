public class Quack implements ISound{
    @Override
    public void makeSound() {
        System.out.println("sonido quack ...");
    }

    @Override
    public String toString() {
        return "QuackSound {}";
    }
}
