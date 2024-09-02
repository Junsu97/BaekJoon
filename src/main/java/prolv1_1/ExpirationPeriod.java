package prolv1_1;

import java.util.*;

public class ExpirationPeriod {
    public int[] solution(String today, String[] terms, String[] privacies) {
        final int lastMonth = 12;
        String[] todayArr = today.split("\\.");
        int todayYear = Integer.parseInt(todayArr[0]);
        int todayMonth = Integer.parseInt(todayArr[1]);
        int todayDay = Integer.parseInt(todayArr[2]);
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> termsMap = new HashMap<>();

        int idx = 1;
        for(String term : terms) {
            String[] temp = term.split("\\s");
            String type = temp[0];
            String value = temp[1];
            termsMap.put(type, Integer.parseInt(value));
        }
        for (String privacy : privacies) {
            String[] split = privacy.split("\\s");
            String expirationPeriod = split[0]; // 유효기간
            String[] temp = expirationPeriod.split("\\.");
            int priYear = Integer.parseInt(temp[0]);
            int priMonth = Integer.parseInt(temp[1]);
            int priDayNum = Integer.parseInt(temp[2]);

            int term = termsMap.get(split[1]);
            priMonth += term;
            while (priMonth > lastMonth) {
                priMonth -= lastMonth;
                priYear++;
            }
            System.out.println("priYear: " + priYear + " priMonth: " + priMonth);
            if (priYear < todayYear ||
                    (priYear == todayYear && priMonth < todayMonth) ||
                    (priYear == todayYear && priMonth == todayMonth && priDayNum <= todayDay)) {
                list.add(idx);
            }
            idx++;
        }

        int[] answer = new int[list.size()];
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        ExpirationPeriod period = new ExpirationPeriod();
        int[] answer = period.solution(today, terms, privacies);
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
