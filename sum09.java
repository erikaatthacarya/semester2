import java.text.DecimalFormat;

public class sum09 {
    public int elemen;
    public double keuntungan[];
    public double total;
    public int length;

    sum09(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
    }
    double totalBF(double arr[]){
        for(int i = 0; i < elemen; i++){
            total = total + arr[i];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        } else if (l<r) {
            int mid = (l+r)/2;
            double lsum=totalDC(arr, l, mid-1);
            double rsum=totalDC(arr, mid+1,r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
}
