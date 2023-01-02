import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] a={10,15,21};
        System.out.println(Arrays.toString(solution2(a,7)));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();

        for( int i : arr){
            if(i%divisor==0)
                temp.add(i);
        }
        if(temp.size()==0)
            temp.add(-1);
        Collections.sort(temp);
        answer= temp.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static int[] solution2(int[] arr, int divisor) {
        int[] answer = {};

        answer =Arrays.stream(arr)
                .filter(i -> (i%divisor)==0)
                .toArray();

        if(answer.length==0){
            answer=new int[1];
            answer[0]=-1;
        }
        else
            Arrays.sort(answer);

        return answer;
    }

}