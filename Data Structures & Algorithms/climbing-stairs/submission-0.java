class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }

        int onestepback = 2;
        int twostepback = 1;

        for(int step = 3; step <= n; step++){
            int current = onestepback + twostepback;

            twostepback = onestepback;
            onestepback = current;

        }
        return onestepback;
    }
}
