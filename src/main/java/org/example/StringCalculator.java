package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n", 2);
            delimiter = parts[0].substring(2);
            numbers = parts[1];
        }
        numbers = numbers.replace("\n", delimiter);
        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();
        for (String num : numArray) {
            int n = Integer.parseInt(num);
            if (n < 0) {
                negatives.add(n);
            }
            sum += n;
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " + negatives);
        }
        return sum;
    }
}
