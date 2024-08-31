package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortScore {
    public static void main(String[] args) {
        List<Score> A = new ArrayList<>();
        A.add(new Score(100, 75));
        A.add(new Score(100, 90));
        A.add(new Score(30, 50));
        A.add(new Score(50,10));

        Collections.sort(A);
        for(int i = 0; i < A.size(); i++){
            System.out.println(A.get(i).toString());
        }
    }
}