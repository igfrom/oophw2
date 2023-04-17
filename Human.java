package hw2.Task2;

public class Human {
    public String name;
    public String status;

    public Human(String n, String s){
        this.name = n;
        this.status = s;
    }

    public void CallCat() { 
        System.out.println("Кис-Кис..."); 
    }

    public void CallDog() { 
        System.out.println("Фас..."); 
    }
    public void FeedAnimals() { 
        System.out.println("*насыпает корм*"); 
    }
}
