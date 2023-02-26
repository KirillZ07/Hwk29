package class29;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Hwk2 {
    public static void main(String[] args) {
        /*Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID.
        Display name of each student.*/

        //HashMap<String,Integer> student=new HashMap<>();
        TreeMap<String,Integer> student = new TreeMap<>(); // Alphabetic order
        //LinkedHashMap<String,Integer> student = new LinkedHashMap<>(); // Maintains insertion order.
        student.put("Kate Sprakly", 6587954);
        student.put("Kirill Zemskov", 9555684);
        student.put("Marry Jane", 3587412);
        student.put("Johny Beans", 7856741);
        student.put("Alyssa Baldwin", 8586654);
        student.put("Michael McDonald", 5544954);

        System.out.println(student.keySet());
        System.out.println(student.values());

    }
}
