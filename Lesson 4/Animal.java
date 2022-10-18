package school.lesson4;

public class Animal  {
    protected String type;
    protected String name;
    protected int swims;
    protected int run;
    private static int count;


    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Вид/порода: '" + type + '\'' +
                ", Кличка: '" + name + "\' \nТТХ:" +
                ", Может проплыть " + swims + "м. " +
                ", Может пробежать " + run + "м. " ;
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  - пробежал " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сдался ---- ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - проплыл " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- утонул ---- ");
        }
    }
}