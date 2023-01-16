import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args){

        int a,b=1;
        System.out.println(Arrays.toString(solution(3,12)));

    }

    public static int[] solution(int n, int m) {
        int[] answer = {};
        int a=1,b=1;

        for(int i=1;i<=Math.min(n,m);i++){

            if((n%i)==0 && (m%i)==0)
                a=i;
        }

        b=a*(n/a)*(m/a);
        return new int[]{a,b};
    }
}
