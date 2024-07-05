package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.getClass().getName() = " + animal.getClass().getName());
        System.out.println("z.getClass().getName() = " + z.getClass().getName());
        return z;
    }
}
