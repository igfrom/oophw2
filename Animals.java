package hw2.Task2;

public abstract class Animals {
    protected String typeAnimals;

    protected void SetTypeAnimals(String t) {
        this.typeAnimals = t;
    }

    // животное откликается
    public abstract void AnswerAnimals();

}