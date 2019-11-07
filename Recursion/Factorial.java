package Recursion;

public class Factorial {
    int factorial =0;
    public int Fact(int n) {
//        if(n == 0) return 0;
//        if(n==1) return 1;
//
//        return   Fact(n-1) * n;
//        //return factorial;

        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i =2;i<=n;i++) {
            f[i] = f[i-1] * i;
        }
        return f[n];
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.Fact(20));
    }
}
