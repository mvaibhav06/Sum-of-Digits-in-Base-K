public class SumOfDigits {
    public int sumBase(int n, int k) {
        int out = 0;
        while(n > 0){
            out += n%k;
            n = n/k;
        }
        return out;
    }
}
