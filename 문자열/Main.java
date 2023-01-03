import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        int[] a={10,15,21};
        System.out.println(Arrays.toString(solution(a)));
    }

     public static int[] solution(int[] arr) {
         int[] answer = {};

         if(arr.length==1){
             answer= new int[1];
             answer[0]=-1;
         }
         else{
             List<Integer> temp = Arrays.stream(arr).boxed().collect(Collectors.toList());
             temp.remove(Integer.valueOf(Collections.min(temp)));
             answer = temp.stream().mapToInt(i -> i).toArray();
         }
         return answer;
     }

}