import java.util.Arrays;

// 정렬 유형
public class PS01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, -5, 2, 4, 3})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 1, 7})));
    }

    private static int[] solution(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

}