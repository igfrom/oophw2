package hw2.Task2;

public class Main {
    public static void main(String[] args) {

        Human man = new Human("Goga", "husband");
        Human woman = new Human("Osa", "wife");
        Dog dog = new Dog("Dog", "Sebek");
        Cat cat = new Cat("Cat", "Kotofei");

        man.CallCat();
        cat.AnswerAnimals();
        woman.CallDog();
        dog.AnswerAnimals();
        woman.FeedAnimals();
        dog.animalEats(dog);
        cat.animalEats(dog);
}
}