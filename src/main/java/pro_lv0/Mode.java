package pro_lv0;

import java.util.HashMap;
import java.util.Map;
public class Mode {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        int mode = -1;

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(num));
        }

        int frequencyCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mode = entry.getKey();
                frequencyCount++;
            }
        }

        if (frequencyCount > 1) {
            return -1;
        }

        return mode;
    }


    public static void main(String[] args) {
        Mode mode = new Mode();
        System.out.println(mode.solution(new int[]{ 1,2, 3, 3, 3, 4}));
    }
}
