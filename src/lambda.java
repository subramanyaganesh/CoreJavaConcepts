import java.util.function.Function;

public class lambda {
    public static void main(String... args){
        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println( converter.apply(15));
    }
}








