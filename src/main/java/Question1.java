public class Question1 implements Question {
    @Override
    public void run() {
        Cat cat = new Cat();
        cat.Age = 1;
        cat.Name = "ここ";
        cat.showProfile();
        cat.sleep();
    }
}
