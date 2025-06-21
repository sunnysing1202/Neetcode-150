package Basics;
import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Dhanbad", 2025);
        map.put("Dehradun", 2023);
        map.put("Patna", 2019);
        map.put("Hajipur", 2017);

        System.out.println(map);
    }
}