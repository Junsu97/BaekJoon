package prolv1_1;

public class ParkWalk {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2]; // {남북, 동서}
        int parkHeight = park.length;
        int parkWidth = park[0].length();
        char[][] parkSize = new char[parkHeight][parkWidth];
        int startX = 0, startY = 0;
        int currentXIndex = 0;
        int currentYIndex = 0;

        // 공원의 크기와 시작점 찾기
        for (int i = 0; i < parkHeight; i++) {
            for (int j = 0; j < parkWidth; j++) {
                parkSize[i][j] = park[i].charAt(j);
                if (parkSize[i][j] == 'S') {
                    currentXIndex = i;
                    startX = currentXIndex;
                    currentYIndex = j;
                    startY = currentYIndex;
                }
            }
        }

        // 각 경로에 대해 이동
        for (String route : routes) {
            String[] direction = route.split("\\s");
            String routeDir = direction[0];
            int distance = Integer.parseInt(direction[1]);

            boolean canMove = true;
            int nextX = currentXIndex;
            int nextY = currentYIndex;

            // 이동할 수 있는지 확인
            for (int i = 1; i <= distance; i++) {
                switch (routeDir) {
                    case "N":
                        nextX = currentXIndex - i; // 위쪽으로 이동
                        break;
                    case "S":
                        nextX = currentXIndex + i; // 아래쪽으로 이동
                        break;
                    case "W":
                        nextY = currentYIndex - i; // 왼쪽으로 이동
                        break;
                    case "E":
                        nextY = currentYIndex + i; // 오른쪽으로 이동
                        break;
                }

                // 경계를 벗어나거나 장애물에 도달하는지 체크
                if (nextX < 0 || nextX >= parkHeight || nextY < 0 || nextY >= parkWidth || parkSize[nextX][nextY] == 'X') {
                    canMove = false;
                    break;
                }
            }

            // 이동이 가능한 경우 위치 업데이트
            if (canMove) {
                switch (routeDir) {
                    case "N":
                        currentXIndex -= distance;
                        break;
                    case "S":
                        currentXIndex += distance;
                        break;
                    case "W":
                        currentYIndex -= distance;
                        break;
                    case "E":
                        currentYIndex += distance;
                        break;
                }
            }
        }

        // 최종 위치 계산
        answer[0] = currentXIndex; // 최종 X 위치
        answer[1] = currentYIndex; // 최종 Y 위치

        return answer;
    }

    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        ParkWalk pw = new ParkWalk();
        pw.solution(park, routes);
    }

}
