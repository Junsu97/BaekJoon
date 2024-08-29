package prolv1_1;

import java.util.*;

public class Kakao2022Blind {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> set = new HashSet<>(Arrays.asList(report)); // 중복제거
        String[] reports = set.toArray(new String[set.size()]); // 다시 되돌림 ㅇㅇ -> 매우 비효율 적인데 넘나 편한것
        Map<String, List<String>> reportMap = new HashMap<>(); // 신고자, 신고 받은 사람들
        Map<String, Integer> flaggedMap = new HashMap<>(); // 신고 받은사람, 신고받은 수
        for (String str : reports) {
            String reporter = str.split(" ")[0];
            String flaggedUser = str.split(" ")[1];
            flaggedMap.put(flaggedUser, flaggedMap.getOrDefault(flaggedUser, 0) + 1);
            reportMap.computeIfAbsent(reporter, r -> new ArrayList<>()).add(flaggedUser);
        }

        for (String flaggedUser : flaggedMap.keySet()) {
            if (flaggedMap.get(flaggedUser) >= k) {
                for(int i = 0; i < id_list.length; i++){
                    if(reportMap.containsKey(id_list[i])) {
                        if (reportMap.get(id_list[i]).contains(flaggedUser) ) {
                            answer[i]++;
                        }
                    }
                }
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] arr = solution(id_list, report, k);
        for(int a : arr){
            System.out.println(a);
        }
    }
}
