import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        System.out.println(list.toString());

    }

    public static int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

        for(int temp : numbers){
            if(list.contains(temp))
                list.remove(Integer.valueOf(temp));
        }

        answer = list.stream().mapToInt(i -> i).sum();

        return answer;
    }

}