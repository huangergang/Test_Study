package test.com.javaSE1.nineUnit;

import java.util.*;

public class Test9 {

    public static void main(String[] args) {

        Set<String> words = new HashSet<>();
        long totalTime = 0;

        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextLine()) {
                String word = in.nextLine();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        Iterator<String> iter = words.iterator();
        for (int i = 0; i <= 20 && iter.hasNext(); i++) {
            System.out.print(iter.next() + " ");
        }

        System.out.println("...");
        System.out.println(words.size() + "个单词,  " + totalTime + " milliseconds.");

    }


}
