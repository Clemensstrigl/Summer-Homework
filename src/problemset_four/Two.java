package problemset_four;

public class Two {
    double x,y;
    public Two(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distanceTo(Two other){
        double XDifference = Math.abs(other.x - this.x);
        double YDifference = Math.abs(other.y - this.y);
        double TotalD = Math.sqrt((XDifference * XDifference) + (YDifference * YDifference));
        return TotalD;
    }

    public boolean isRightOf(Two other){
        if(other.x < this.x){
            return true;
        }
        return false;
    }

    public boolean areClose(Two other, double amt){
        if(distanceTo(other) >= amt){
            return true;
        }
        return false;
    }


}
