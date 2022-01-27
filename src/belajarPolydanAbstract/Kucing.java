package belajarPolydanAbstract;

public class Kucing extends Hewan{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meong");
    }
}
