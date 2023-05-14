import java.util.*;

class Solution {
    
public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] binArray1= new String[n][n];
        String[][] binArray2= new String[n][n];
        
        for(int i=0; i<n; i++){
            answer[i]="";
            binArray1[i]=decodeBinary(n,arr1[i]);
            binArray2[i]=decodeBinary(n,arr2[i]);
            for(int k=0;k<n;k++){
                if(binArray1[i][k].isBlank() && binArray2[i][k].isBlank())
                    answer[i]+=" ";
                else
                    answer[i]+="#";
            }
        }
        return answer;
    }
    
public String[] decodeBinary(int n, int number){
    
    int quotient = number, remainder=0;
    int[] binaryResult = new int[n];
    String[] result= new String[n];
    
    for(int i=1; i<n; i++){
        
        if(i!=n-1){
            remainder=quotient%2;
            binaryResult[n-i]=remainder;
            quotient=quotient/2;
        }else{
            binaryResult[0]=quotient/2;
            binaryResult[1]=quotient%2;
        }
        
    }
    
    for(int i=0; i<n; i++){
        if(binaryResult[i] == 0){
            result[i]=" ";
        }else{
            result[i]="#";
        }
    }
    
    return result;
    }
}
