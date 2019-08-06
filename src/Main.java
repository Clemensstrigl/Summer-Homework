import javax.swing.*;

public class Main {
    problemsset_one o2;
    public void main(String ... args) {
    WeekTwo();
//    WeekThree();
//    WeekFour();
//    WeekFive();
//    WeekSix();

    }
    public void WeekTwo() {


        o2 = new problemsset_one();
        String response = JOptionPane.showInputDialog("What is the Radius of the cirlce; Number only pls");
        double r = (double) (Integer.parseInt(response));
        o2.CalculateCircle(r);


        for (int i = 0; i < 3; i++) {
            String A = JOptionPane.showInputDialog("Value of side a?");
            String B = JOptionPane.showInputDialog("Value of side b?");
            String C = JOptionPane.showInputDialog("Value of side c?");
            int a = Integer.parseInt(A);
            int b = Integer.parseInt(B);
            int c = Integer.parseInt(C);
            o2.GetTriangleArea(a, b, c);
        }


        String windspeed = JOptionPane.showInputDialog("What is the windspeed? 3<x<120!!");
        String temp = JOptionPane.showInputDialog("What is the temperature? -50<x<50!!");
        int windSpeed = Integer.parseInt(windspeed);
        int Temp = Integer.parseInt(temp);
        o2.windChill(Temp, windSpeed);

        for(int i = 0 ; i <20; i++){
            o2.DiceRoll();
        }

    }
}
