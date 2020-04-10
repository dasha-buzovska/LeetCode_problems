public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int result = 1;
        int step = num/2;
        while (step >= 2) {
            if (num % step == 0) {
                result+=step;
            }
            step = step/2 + step%2;
        }
        return result == num;
    }
}
