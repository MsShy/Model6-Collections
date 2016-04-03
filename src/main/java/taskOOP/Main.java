package taskoop;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    private Main() {
    }

    public static void main(String[] args) {


        Comparator<Candies> pcomp = new Sort();
        TreeSet<Candies> candies = new TreeSet(pcomp);
        candies.add(new Chocolate("Sharm", 20, 5));
        candies.add(new Caramels("Roshen", 15, 14));
        candies.add(new Caramels("Jack", 5, 150));


        for (Candies p : candies) {
            System.out.println(p);
        }


        int weightGift = 0;
        for (Candies p : candies) {
            weightGift += p.getWeightCandies();
        }
        System.out.println(String.format("Gift weight=%s", weightGift));


        String name = "Jack";
        for (Candies p : candies) {
            if (name.equals(p.getName())) {
                System.out.println(String.format("Search:%n%s", p));

            }

        }
    }
}
