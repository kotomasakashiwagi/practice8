public class Question3 implements Question {
    @Override
    public void run() {
        Cat cat = new Cat();
        cat.Age = 1;
        cat.Name = "ここ";
        Dog dog = new Dog();
        dog.Age = 10;
        dog.Name = "れお";
        cat.showProfile();
        dog.showProfile();
        cat.speak();
        dog.speak();
    }
}
