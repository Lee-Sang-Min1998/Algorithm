import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        int[] a={4,7,12};
        boolean[] b={true,false,true};
        System.out.println(solution(a,b));

    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i=0;

        while(i<absolutes.length){
            if(signs[i]==true)
                answer+=absolutes[i];
            else
                answer-=absolutes[i];
            i++;
        }

        return answer;
    }

}
