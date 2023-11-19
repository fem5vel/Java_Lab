package bsu.rfct.course2.group6.chernecki;
import java.util.HashMap;

public class Apple extends Food {
    private String variety;
    public static final String RED = "Red";
    public static final String GREEN = "Green";
    public static final String YELLOW = "Yellow";

    private static final HashMap<String, Integer> variety2calories;
    static {
        variety2calories = new HashMap<>();
        variety2calories.put(RED, 52);
        variety2calories.put(GREEN, 48);
        variety2calories.put(YELLOW, 50);
    }

    public Apple(String variety) {
        this.variety = variety;
        this.calories = variety2calories.get(variety);
        this.name = "Apple";
    }

    @Override
    public String toString() {
        return "Apple{" +
                "variety='" + variety + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public void Consume() {
        System.out.println(variety + " " + name + " has been eaten.");
    }

    @Override
    public int CalculateCalories() {
        return calories;
    }
}