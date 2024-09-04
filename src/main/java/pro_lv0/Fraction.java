package pro_lv0;

public class Fraction {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int lcm = getLCM(denom1, denom2);

        numer1 = numer1 * (lcm / denom1);
        numer2 = numer2 * (lcm / denom2);

        int numer = numer1 + numer2;
        int denom = lcm;

        int gcd = getGCD(numer, denom);
        answer[0] = numer / gcd;
        answer[1] = denom / gcd;

        return answer;
    }

    private static int getLCM(int num1, int num2) {
        return (num1 * num2) / getGCD(num1, num2);
    }

    private static int getGCD(int num1, int num2) {
        if (num2 == 0) return num1;
        return getGCD(num2, num1 % num2);
    }
}
