public class Mute implements ISound{
    @Override
    public void makeSound(){
        System.out.printf("Sin sonido ...");
    }
    @Override
    public String toString(){
        return "MuteSound {}";
    }
}
