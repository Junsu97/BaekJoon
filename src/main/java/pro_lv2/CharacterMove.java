package pro_lv2;

public class CharacterMove {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int width = board[0]/2;
        int height = board[1]/2;
        int currentX = 0;
        int currentY = 0;
        for(String str : keyinput) {
            switch (str){
                case "up":
                    currentY++;
                    if(currentY > height){
                        currentY--;
                        continue;
                    }
                    break;
                case "down":
                    currentY--;
                    if(currentY < -height){
                        currentY++;
                        continue;
                    }
                    break;
                case "left":
                    currentX--;
                    if(currentX < -width){
                        currentX++;
                        continue;
                    }
                    break;
                case "right":
                    currentX++;
                    if(currentX > width){
                        currentX--;
                        continue;
                    }
                    break;
            }
        }
        answer[0] = currentX;
        answer[1] = currentY;
        return answer;
    }
}
