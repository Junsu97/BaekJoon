package pro_lv2;

import java.util.HashMap;
import java.util.Map;

public class Parallel {
    public int solution(int[][] dots) {
        // 기울기를 비교하는 함수
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

        return 0;
    }

    // 두 직선의 기울기가 같은지 확인하는 함수
    private boolean isParallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        int dx1 = dot2[0] - dot1[0];
        int dy1 = dot2[1] - dot1[1];
        int dx2 = dot4[0] - dot3[0];
        int dy2 = dot4[1] - dot3[1];

        // 기울기가 같으면 true 반환
        return dx1 * dy2 == dy1 * dx2;
    }
}
