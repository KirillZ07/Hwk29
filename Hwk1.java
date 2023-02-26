package class29;

import java.util.LinkedHashSet;

public class Hwk1 {
    public static void main(String[] args) {
        /* Create a Set of cities in which you want to make sure,
         that insertion order is maintained.
         Then remove any city that starts with “A”; */

        // Does not allow duplications and retains the insertion order.
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Toshkent");
        cities.add("Austin");  // Removed
        cities.add("Moscow");
        cities.add("Los Angeles");
        cities.add("New York");
        cities.add("Japan");
        cities.add("Boston");
        cities.add("Anchorage"); // Removed
        cities.add("China");

        // Command that removes the letter "A"
        cities.removeIf(c->c.contains("A"));
        System.out.println(cities);
    }
}
