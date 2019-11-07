package Arrays;

public class MaximumSubArray {

    public String solution(String S, int K) {
        // write your code in Java SE 8
        String[] str = S.split("-");

        int length =0;
        int noOfsplit=0;
        for(String s: str){
            noOfsplit++;
            for(int i=0;i<s.length();i++){
                length++;
            }
        }
        if(length%K==0){
            S.substring(0,length/K);
        }
        System.out.println(S);
        return S;
    }
    public static void main(String[] args) {
       MaximumSubArray arr =new MaximumSubArray();
       arr.solution("2-4A0r7-4k", 4);

    }
}
