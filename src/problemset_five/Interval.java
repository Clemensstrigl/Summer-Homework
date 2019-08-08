package problemset_five;

public class Interval {
    int low, high, difference;
    public Interval(int low, int high) {
        this.low= low;
        this.high = high;
        difference = high-low;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
