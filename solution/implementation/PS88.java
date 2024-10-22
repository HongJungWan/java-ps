package implementation;

// 구현
public class PS88 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int n : numbers)
            answer -= n;
        return answer;
    }
}