public class Question2 implements Question {
    @Override
    public void run() {
        Cat cat = new Cat();
        cat.Age = 1;
        cat.Name = "ここ";
        cat.showProfile();
        Dog dog = new Dog();
        dog.Age = 10;
        dog.Name = "れお";
        dog.showProfile();
        cat.sleep();
        dog.run();
    }
}
