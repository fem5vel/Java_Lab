package bsu.rfct.course2.group6.chernecki;
import java.util.HashMap;

public class Milk extends Food {
    private String fatContent;
    public static final String WHOLE = "Whole";
    public static final String LOWFAT = "Lowfat";
    public static final String SKIM = "Skim";

    private static final HashMap<String, Integer> fatContent2calories;
    static {
        fatContent2calories = new HashMap<>();
        fatContent2calories.put(WHOLE, 149);
        fatContent2calories.put(LOWFAT, 102);
        fatContent2calories.put(SKIM, 83);
    }

    public Milk(String fatContent) {
        this.fatContent = fatContent;
        this.calories = fatContent2calories.get(fatContent);
        this.name = "Milk";
    }

    @Override
    public String toString() {
        return "Milk{" +
                "fatContent='" + fatContent + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public void Consume() {
        System.out.println(fatContent + " " + name + " has been drunk.");
    }

    @Override
    public int CalculateCalories() {
        return calories;
    }
}