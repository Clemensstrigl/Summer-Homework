package problemset_four;

public class One {
int radius;
    public One(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public double volunme(){
        return (4/3)*Math.PI * (radius*radius*radius);
    }

    @Override
    public String toString() {
        return "One{" + "radius=" + radius + '}';
    }

    public boolean isLargerThan(One o){
        if(o.radius < this.radius){
            return true;
        }
        return false;
    }


}
