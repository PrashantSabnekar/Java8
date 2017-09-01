package behaviorparameterization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prashant.sabnekar on 9/1/2017.
 */
public class Demo {
    private List<Apple> inventory = new ArrayList<>();

    public void setUpInventory() {
        inventory.add(new Apple("Red", 100));
        inventory.add(new Apple("Red", 150));
        inventory.add(new Apple("Red", 200));
        inventory.add(new Apple("Green", 100));
        inventory.add(new Apple("Green", 150));
        inventory.add(new Apple("Green", 200));
    }

    public List<Apple> getGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        for(Apple a : inventory) {
            if (a.getColor().equals("Green")) {
                greenApples.add(a);
            }
        }
        return greenApples;
    }

    public List<Apple> filterApplesByColor(String color) {
        List<Apple> grenApples = new ArrayList<>();
        for(Apple a : inventory) {
            if (a.getColor().equals(color)) {
                grenApples.add(a);
            }
        }
        return grenApples;
    }

    public List<Apple> filterApplesByWeight(int weight) {
        List<Apple> grenApples = new ArrayList<>();
        for(Apple a : inventory) {
            if (a.getWeight() >= weight) {
                grenApples.add(a);
            }
        }
        return grenApples;
    }

    public List<Apple> filterApplesByRedColorUsingPredicate(ApplePredicate applePredicate) {
        List<Apple> redApples = new ArrayList<>();

        for(Apple apple : inventory) {
            if(applePredicate.test(apple)) {
                redApples.add(apple);
            }
        }
        return redApples;
    }

    public static void main(String args[]) {
        Demo demo = new Demo();
        demo.setUpInventory();
        List<Apple> redApples = demo.filterApplesByRedColorUsingPredicate(new AppleRedColorPredicate());
        for(Apple apple : redApples) {
            System.out.println(apple.getColor());
        }

    }
}

