import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "1354243d2";
        boolean isInteger = str.chars().allMatch(x -> Character.isDigit(x));
        System.out.println(isInteger);
    }
}