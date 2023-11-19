package bsu.rfct.course2.group6.chernecki;

import java.util.Arrays;
import java.util.Scanner;

//Milk/Skim Cheese/Mozzarella Apple/Green

public class Main {
    public static void main(String[] args) {
        boolean cals = Arrays.stream(args).anyMatch("-calories"::equals);
        Scanner scan = new Scanner(System.in);
        System.out.println("Input brackfast:");

        try{
            Food[] food = new Food[12];

            String buff = scan.nextLine();
            String[] input = buff.split(" ");
            int itemSoFar = 0;
            for(String arg : input){
                String[] parts = arg.split("/");
                    if(parts[0].equals("Milk")){
                        if(parts[1].equals("Lowfat"))
                        food[itemSoFar] = new Milk(Milk.LOWFAT);
                    else if(parts[1].equals("Skim"))
                        food[itemSoFar] = new Milk(Milk.SKIM);
                    else 
                        food[itemSoFar] = new Milk(Milk.WHOLE);
                    itemSoFar++;
                }
                else if(parts[0].equals("Cheese")){
                    if(parts[1].equals("Cheddar"))
                        food[itemSoFar] = new Cheese(Cheese.CHEDDAR);
                    else if(parts[1].equals("Mozzarella"))
                        food[itemSoFar] = new Cheese(Cheese.MOZZARELLA);
                    else 
                        food[itemSoFar] = new Cheese(Cheese.SWISS);
                    itemSoFar++;
                }
                else if(parts[0].equals("Apple")){
                    if(parts[1].equals("Red"))
                        food[itemSoFar] = new Apple(Apple.RED);
                    else if(parts[1].equals("Green"))
                        food[itemSoFar] = new Apple(Apple.GREEN);
                    else 
                        food[itemSoFar] = new Apple(Apple.YELLOW);
                    itemSoFar++;
                }
            }

            Arrays.sort(food, 0, itemSoFar, (Food x, Food y) -> {
                return y.toString().length() - x.toString().length();
            });

            int sumCalories = 0;
            for (int i = 0; i < itemSoFar; i++) {
                if(food[i] != null){
                    int curCalories = food[i].CalculateCalories();
                    food[i].Consume();
                    sumCalories += curCalories;
                }
            }
            if (cals){
                System.out.printf("Sum of calories: " + sumCalories );
            }
            else{
                System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
