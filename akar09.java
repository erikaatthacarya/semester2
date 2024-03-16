public class akar09 {
    public double num;
    public double akar09BF(double num){
        double low = 0, high = num, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid == num) {
                low = mid + 0.00001; 
            } else {
                high = mid - 0.00001;
            }
        }
        return low;
    }
    public double akar09DC(double num, double low, double high){
        double mid = low + (high - low) / 2;
        if (high - low < 0.00001) {
            return mid;
        }
        if (mid * mid == num) {
            return mid;
        } else if (mid * mid < num) {
            return akar09DC(num, mid + 1, high);
        } else {
            return akar09DC(num, low, mid - 1);
        }
    }
}
