import java.util.stream.IntStream;

public class Animal {
    public String Name;
    public int Age;

    public void showProfile() {
        System.out.println("名前は、" + Name + "、" + Age + "歳です。");
    }

    public void speak() {
        System.out.println("......");
    }

    public Animal[] createAnimalArray(int size) {
        Animal[] animal = new Animal[size];
        IntStream.range(0, size).forEach(i -> {
            if (size % 2 == 0) {
                new Cat();
            } else {
                new Dog();
            }
        });
        return animal;
    }

    public void MakeAnimalSpeak(Animal[] animal) {
        IntStream.range(0, animal.length).forEach(i -> animal[i].speak());
    }
}
