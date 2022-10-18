package school.lesson4;

public class Dog extends Animal {
    private static int count;

    public Dog(String type, String name, int swims, int run) {
        this.type = type;
        this.name = name;
        this.swims = swims;
        this.run = run;
        count++;
    }

    public static int getCount() {
        return count;
    }
}