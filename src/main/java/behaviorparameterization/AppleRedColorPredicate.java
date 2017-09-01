package behaviorparameterization;

/**
 * Created by prashant.sabnekar on 9/1/2017.
 */
public class AppleRedColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "Red".equalsIgnoreCase(apple.getColor()) ? true : false;
    }

}
