package greedy;

import java.util.ArrayList;
import java.util.Arrays;

// 그리디
public class PS77 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(123)));
        System.out.println(Arrays.toString(solution(350)));
    }

    private static int[] solution(int amount) {
        // ❶ 화폐 단위를 큰 순서대로 정렬해서 저장
        int[] denominations = {100, 50, 10, 1};

        // ❷ 거스름돈을 담을 리스트
        ArrayList<Integer> change = new ArrayList<>();

        for (int coin : denominations) {
            // ❸ 해당 화폐 단위로 거스름돈을 계속 나눠줌
            while (amount >= coin) {
                change.add(coin); // ❹ 거스름돈 리스트 업데이트
                amount -= coin; // ❺ 정산이 완료된 거스름돈 뺌
            }
        }
        // ❻ 거스름돈 리스트를 배열로 변경하여 반환
        return change.stream().mapToInt(Integer::intValue).toArray();
    }

}