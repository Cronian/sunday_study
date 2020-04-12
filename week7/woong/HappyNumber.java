class Solution {
    public boolean isHappy(int n) {
        int s,f;
        s = f = n;
        do {
            s = calc(s);
            f = calc(calc(f));
        }while(s!=f);
        
        return (s == 1);
    }
    
    public int calc(int n) {
        int sum = 0;
        while(n != 0) {
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
}
