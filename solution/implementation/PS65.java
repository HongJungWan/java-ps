package implementation;

// 구현
public class PS65 {

    public int solution(int n) {
        return Integer.toBinaryString(n).
                replace("0", "").
                length();
    }

}