package taskoop;

public class Candies {


    private String name;
    private int weight;
    private int quantity;

    public Candies(String name, int quantity, int weight) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;

    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getWeight() {
        return weight;
    }

    public int getWeightCandies() {

        return weight * quantity;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "name='" + name + '\'' +
                ", weight one candy=" + weight +
                ", weight of " + quantity + " candies=" + getWeightCandies() +
                " gram" + "}";
    }
}

