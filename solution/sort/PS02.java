package sort;

import java.util.Arrays;
import java.util.Collections;

// 정렬
public class PS02 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 2, 1, 3, 4})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));
    }

    private static int[] solution(int[] arr) {
        Integer[] result = Arrays.stream(arr).
                boxed().
                distinct().
                toArray(Integer[]::new); // ❶ 중복값 제거

        Arrays.sort(result, Collections.reverseOrder()); // ❷ 내림차순 정렬

        return Arrays.stream(result)
                .mapToInt(Integer::intValue)
                .toArray(); // int형 배열로 변경 후 반환
    }

}