package school.lesson4;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Кот", "Матроскин", 0, 130);
        animals[1] = new Cat("Кошка", "Лола", 0, 200);
        animals[2] = new Dog("Собака (кобель)", "Пушок", 10, 500);
        animals[3] = new Dog("Собака (самка) ", "Лизка", 8, 450);

        System.out.println("Характеристики животных");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("Всего котов создано: " + Cat.getCount());
        System.out.println("Всего собак создано: " + Dog.getCount());
        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Проверка выносливость: ");
        System.out.println("Бег: ");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(400);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Плавание: ");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(5);
        }
    }
}
