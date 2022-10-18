package school.lesson4;

public class Cat extends Animal {
    private static int count;
    public String name;
    public int appetite;
    public boolean fullness;

    public Cat(String type, String name, int swims, int run) {
        this.type = type;
        this.name = name;
        this.swims = swims;
        this.run = run;
        count++;
    }
    public static int getCount() {
        return count;
    }
    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}