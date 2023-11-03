public abstract class Duck {
    public Duck(){}
protected IFly flyBehavior;
protected ISound soundBehavior;
    public void swim(){
        System.out.println("Estoy nadando, incluso puedo flotar");
    }
    public void performFly(){
       flyBehavior.fly();
    }
    public void performSound(){
       soundBehavior.makeSound();
    }
    public abstract void display()  ;
    public String toString() {
        return "duck{}";
    }
}
