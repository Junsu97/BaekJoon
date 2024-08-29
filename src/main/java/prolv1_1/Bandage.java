package prolv1_1;

public class Bandage {

    /**
     * @param bandage 길이 = 3 [시전 시간, 초당 회복량, 추가 회복량]
     * @param health  최대 체력
     * @param attacks [공격시간, 피해량]
     * @return
     */
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int cnt = bandage[0]; // 붕대 감기 완료
        int now = health; // 현재 체력
        int std = 0; // 마지막으로 공격

        int v1, v2; // 추가 체력 받을 수 있나?
        for (int[] atk: attacks) {
            if (now <= 0) {
                return -1;
            }
            v1 = atk[0] - std - 1; // 시간 차이
            v2 = v1 / cnt; // 추가 체력 회수
            // 맞기 직전까지의 체력 정산

            now = Math.min(health, now + (v1 * bandage[1]));
            now = Math.min(health, now + (v2 * bandage[2]));
            now -= atk[1];
            std = atk[0];
        }

        return now <= 0 ? -1 : now;
    }

    public static void main(String[] args) {
        int[] bondage = {1, 1, 1};
        int health = 5;
        int[][] attacks = {{1,2},{3,2}};
        System.out.println(solution(bondage,health,attacks));

    }
}
