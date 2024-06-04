import java.io.*;
import java.util.*;


/**
 * int형은 BufferedWriter를 통해 출력할 수 없다. 따라서 String으로 형 변환이 필요하다.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int index = 1;
        while (queue.size() != 1) {
            while (index != k) {
                Integer value = queue.poll();
                queue.offer(value);
                index++;
            }
            queue.poll();
            index = 1;
        }

        bw.write(String.valueOf(queue.peek()));
        bw.flush();

    }
}
