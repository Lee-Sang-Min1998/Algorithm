import java.io.*;
import java.util.*;

/**
 * 자바 연산자 | vs || |는 선행 조건이 참이여도 후행 조건이 참,거짓인지 판단한다. ||는 선행 조건이 참이면 후행 조건을 검사하지 않는다.
 * 중복을 제거하기 위한 자료구조는 'Set'이다.
 * TreeSet의 경우, 정렬 기능까지 지원한다.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int u = j + 1; u < n; u++) {
                    int key = arr[i] + arr[j] + arr[u];
                    set.add(key);
                }
            }
        }

        int index = 0;
        for (int element : set) {
            index++;
            if (index == k) {
                System.out.println(element);
                return;
            }
        }

        System.out.println(-1);
    }
}
