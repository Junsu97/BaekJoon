package algorithm;

/**
 * 단어 퍼즐은 주어진 단어 조각들을 이용해서 주어진 문장을 완성하는 퍼즐입니다. 이때, 주어진 각 단어 조각들은 각각 무한개씩 있다고 가정합니다.
 * 예를 들어 주어진 단어 조각이 [“ba”, “na”, “n”, “a”]인 경우 "ba", "na", "n", "a" 단어 조각이 각각 무한개씩 있습니다.
 * 이때, 만들어야 하는 문장이 “banana”라면 “ba”, “na”, “n”, “a”의 4개를 사용하여 문장을 완성할 수 있지만,
 * “ba”, “na”, “na”의 3개만을 사용해도 “banana”를 완성할 수 있습니다. 사용 가능한 단어 조각들을 담고 있는 배열 strs와 완성해야 하는 문자열 t가 매개변수로 주어질 때,
 * 주어진 문장을 완성하기 위해 사용해야 하는 단어조각 개수의 최솟값을 return 하도록 solution 함수를 완성해 주세요. 만약 주어진 문장을 완성하는 것이 불가능하면 -1을 return 하세요.
 * <p>
 * 제한사항
 * strs는 사용 가능한 단어 조각들이 들어있는 배열로, 길이는 1 이상 100 이하입니다.
 * strs의 각 원소는 사용 가능한 단어조각들이 중복 없이 들어있습니다.
 * 사용 가능한 단어 조각들은 문자열 형태이며, 모든 단어 조각의 길이는 1 이상 5 이하입니다.
 * t는 완성해야 하는 문자열이며 길이는 1 이상 20,000 이하입니다.
 * 모든 문자열은 알파벳 소문자로만 이루어져 있습니다.
 * <p>
 * 입출력 예
 * strs	t	result
 * ["ba","na","n","a"]	"banana"	3
 * ["app","ap","p","l","e","ple","pp"]	"apple"	2
 * ["ba","an","nan","ban","n"]	"banana"	-1
 */
public class WordPuzzle {
    public static int solution(String[] strs, String t) {
        int answer = 0; // 리턴할 값
        int wordSize = t.length(); // 주어진 문자열의 길이
        int strsLength = strs.length; // 주어진 문자열 배열의 길이
        int[] dp = new int[wordSize + 1]; // DP 배열 문자열의 길이 + 1

        for(int i = 1; i < wordSize + 1; i++){ // 1부터 문자열의 길이만큼 반복하여 문자열 t의 각 문자 위치까지 순회함
            for(int j = 0; j < strsLength; j++){  // 문자열 배열의 길이만큼 순회
                String str = strs[j]; // 문자열 배열을 0번부터 꺼내옴
                int strLength = str.length(); // 꺼내온 문자열의 길이
                if(i - strLength < 0) continue; // 현재 위치에서 조각을 적용할 수 없으면 아래 무시하고 다시 for 문으로 돌아감, 현재 문자열의 길이 - 꺼내온 문자열의 길이가 0보다 적으면 적용할 수 없음

                /***
                 * 현재 문자열의 위치 - 꺼내온 문자열의 길이부터, 현재 문자열의 길이로 substring하여 그 값이 같다면
                 * 위 값이 같다는 것은 예를 들어 주어진 문자열이 apple 이고
                 * ["app","ap","p","l","e","ple","pp"] 이와 같은 문자열 배열이 주어졌을 때
                 * 현재 순번이 1일 때는 해당되는게 없음 t.substring(1 - strLength, 1) str이 "p"나 "l"혹은 "e"가 들어오면 1-1, 1 즉 0~1인 "a"를 리턴함
                 * a와 대칭되는 것이 없음
                 * 근데 i가 2가 되면
                 * t.substring(2 - 1, 2)랑 t.substring(2 - 2, 2)가 되는데 이건 각각 "p"와 "ap"를 리턴함
                 * 배열에서 "p"와 "ap"가 이 값에 해당함
                 */
                if(str.equals(t.substring(i - strLength, i))){
                    /**
                     * 위 조건문을 통과한 문자열중에
                     * i(문자열에서 현재까지의 길이) - 꺼내온 문자열 을 한 값이 0인 경우에만 dp[i]에 1을 넣음
                     * ap가 해당되고
                     * dp[2] = 1이 됨
                     */
                    if(i - strLength == 0){
                        dp[i] = 1;
                        System.out.println("i : " + i + " " + str);
                    }
                    /**
                     * 조각 "ap"를 사용하여 dp[2] = 1로 설정됨. 이는 "ap"라는 부분 문자열을 만들기 위해 최소 하나의 조각이 필요함을 의미
                     * i = 4 까지 진행됐을 때 ("appl"까지의 부분 문자열을 고려 중)
                     * 현재 조각이 "pl"이고, strLength = 2임.
                     * i - strLength = 4 - 2 = 2
                     * dp[2]는 "ap"를 만들 수 있는 최소 조각 수를 가지고 있으며, 이 값은 1입니다.
                     * 따라서 dp[2] > 0 조건은 참입니다.
                     * dp[i] 업데이트:
                     * dp[4]를 계산하려면 "appl"을 만들 수 있는 최소 조각 수를 알아야 합니다.
                     * "appl"을 만들기 위해 "ap"에 "pl"을 추가할 수 있으므로, dp[4]는 dp[2] + 1 = 1 + 1 = 2가 됩니다.
                     * 따라서, "ap"와 "pl"의 조합으로 "appl"을 만들 때 최소 2개의 조각이 필요합니다.
                     */
                    if(dp[i - strLength] > 0){
                        dp[i] = dp[i] == 0 ? dp[i - strLength] + 1 : Math.min(dp[i], dp[i - strLength] + 1);
                        System.out.println("dd : " + str);
                        System.out.println(i - strLength);
                    }
                }
            }
        }

        answer = dp[wordSize];
        if(answer == 0) return -1;
        return answer;
    }

    public static void main(String[] args) {
        String[] strs = {"app", "ap", "p", "l", "e", "ple", "pp"};
        String word = "apple";

        System.out.println(solution(strs, word));
    }
}
