package problemset_six.problem_one;

import problemset_four.Two;

import javax.swing.*;
import java.util.ArrayList;

public class Path {
    double length = 0;
    ArrayList<Two> PointList = new ArrayList<Two>();
    public Path() {
    }
    
    public void addPoint(double x, double y){
        PointList.add(new Two(x,y));
    }

    public int getTotalPoints() {
        return PointList.size();
    }

    public double getLength() {

            for (int i = 0; i < PointList.size() - 1; i++) {
                Two p1 = PointList.get(i);
                Two p2 = PointList.get(i+1);
                length = length + p1.distanceTo(p2);
            }
        return length;
    }
}
