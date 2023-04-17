package hw2.Task2;

public class Cat extends Animals implements AnimalEats{
    public String name;

    public Cat(String t, String n) {
        SetTypeAnimals(t);
            this.name = n;
        }

    @Override
    public void AnswerAnimals() { 
        System.out.println("Миумиумиу"); 
    }

    @Override
    public void animalEats(Animals target) { 
        System.out.println("Ам-ам, мур-мур");
    }
}