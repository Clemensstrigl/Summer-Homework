package problemset_five;

import javax.swing.*;
import java.util.ArrayList;

public class ClientTester {
    public void main(String[] args){
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        for(int i = 0; i<100; i++){
            int j = (int)(Math.random()*500);
            int k = (int)(Math.random()*500);
            if(k<j){
                intervals.add(new Interval(k,j));
            }
            else{
                intervals.add(new Interval(j,k));
            }
        }

        String response = JOptionPane.showInputDialog("number between 0 and 100 (only hole numbers)");
        int target = Integer.parseInt(response);
        System.out.println("Your response lies between the intervals:");
        for(int i = 0; i< intervals.size(); i++){
            if(intervals.get(i).getLow() < target &intervals.get(i).getHigh() > target){
                System.out.println(intervals.get(i).getLow() + " and " + intervals.get(i).getHigh());
            }
        }
    }
}
