import java.io.*;
import java.util.*;


/**
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String data = br.readLine();
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            q.offer(s.charAt(i));
        }

        int index = 0;
        boolean answer = true;

        while (!q.isEmpty() && index < data.length()) {

            int front = q.peek();
            char ch = data.charAt(index);

            if (q.contains(ch)) {
                if (q.peek() == ch) {
                    q.poll();
                } else {
                    answer = false;
                    break;
                }
            }

            index++;

        }

        if (answer == false || !q.isEmpty()) {
            bw.write("NO");
        } else {
            bw.write("YES");
        }

        bw.flush();
    }
}
