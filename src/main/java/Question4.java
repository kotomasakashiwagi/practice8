public class Question4 implements Question {
    @Override
    public void run() {
        Animal animal = new Animal();
        Animal[] animalArray = animal.createAnimalArray(4);
        animal.MakeAnimalsSpeak(animalArray);
    }
}
