package Recursion;

public class LC_70_ClimbingStairs {
    public int climbingStairs(int n) {
        return climb_stairs(0,n);
    }

    public int climb_stairs(int i, int n) {
        if(i>n) return 0;
        if(i==n) return 1;
        return climb_stairs(i+1,n) + climb_stairs(i+2,n);
    }

    public static void main(String[] args){
        LC_70_ClimbingStairs stairs = new LC_70_ClimbingStairs();
        System.out.println(stairs.climbingStairs(3));
    }
}
