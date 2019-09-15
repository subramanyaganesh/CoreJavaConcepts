import java.util.Objects;

public class Equals_Hashcode {
    public static void main(String[] args) {
        Fruit o1=new Fruit();
        Fruit o2=new Fruit();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println( o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(Objects.equals(o1,o2));
    }
}


class Fruit{
    String taste;
    String color;


    /*public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(taste, fruit.taste) &&
                Objects.equals(color, fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taste, color);
    }
}
