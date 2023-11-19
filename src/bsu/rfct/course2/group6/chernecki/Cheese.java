package bsu.rfct.course2.group6.chernecki;
import java.util.HashMap;

public class Cheese extends Food {
    private String type;
    public static final String CHEDDAR = "Cheddar";
    public static final String MOZZARELLA = "Mozzarella";
    public static final String SWISS = "Swiss";

    private static final HashMap<String, Integer> type2calories;
    static {
        type2calories = new HashMap<>();
        type2calories.put(CHEDDAR, 113);
        type2calories.put(MOZZARELLA, 85);
        type2calories.put(SWISS, 111);
    }

    public Cheese(String type) {
        this.type = type;
        this.calories = type2calories.get(type);
        this.name = "Cheese";
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "type='" + type + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public void Consume() {
        System.out.println(type + " " + name + " has been eaten.");
    }

    @Override
    public int CalculateCalories() {
        return calories;
    }
}