package pro_lv2;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Square {
    public int solution(int[][] dots) {
        int answer = 0;
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(dots[0][0],dots[0][1]));
        list.add(new Point(dots[1][0],dots[1][1]));
        list.add(new Point(dots[2][0],dots[2][1]));
        list.add(new Point(dots[3][0],dots[3][1]));

        Collections.sort(list);

        int statX = list.get(0).x;
        int statY = list.get(0).y;
        int endX = list.get(list.size()-1).x;
        int endY = list.get(list.size()-1).y;
        int widht = endX - statX;
        int height = endY - statY;

        answer = widht * height;
        return answer;
    }
}
class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x){
            return this.x - o.x;
        }
        return this.x - o.x;
    }
}
