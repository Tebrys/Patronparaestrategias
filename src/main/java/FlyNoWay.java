public class FlyNoWay implements IFly{
    public FlyNoWay() {}
    @Override
    public void fly() {
        System.out.println("no puedo volar alv");
    }
    @Override
    public String toString() {
        return "FlyNoWay{}";
    }
}
