package hw2.Task2;

public class Dog extends Animals implements AnimalEats{
    public String name;

    public Dog(String t, String n) {
        SetTypeAnimals(t);
        this.name = n;
    }

    @Override
    public void AnswerAnimals(){
        System.out.println("Рррррр");
    }

    
    @Override
    public void animalEats(Animals target) { 
        System.out.println("*довольно чавкает*"); 
    }
}
    

