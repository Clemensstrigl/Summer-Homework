import javax.swing.*;

public class problemsset_one {

    public void CalculateCircle(double r){
        double C = r * 2 * Math.PI;
        double A = r * r * Math.PI;
        System.out.println("If the Circle's radius is " + r + " then its Circumference will be " + C + " and then its Area will be " + A + ".");
    }
    public static double GetTriangleArea ( double a, double b, double c){
        double s = (a + b + c) / 2;
        double A = Math.sqrt(s * (s - a) * (s - b)*(s - c));
return A;

    }
    public static double windChill(double temp,double windSpeed){
        if(temp> -50 && temp <50 && windSpeed >3 && windSpeed <120){
            double w = 35.74 + (0.6215 * temp) + ((0.4275 * temp) - 35.75) * Math.pow(windSpeed, 0.16);
            return w;

        }
        return 0;
    }

    public static void DiceRoll(){
        int DiceOne = (int)Math.random()*5+1;
        int DiceTwo = (int)Math.random()*5+1;
        System.out.println("Dice 1 : " + DiceOne + ", Dice 2 : " + DiceTwo + ", Sum = " + (DiceOne + DiceTwo));
    }
}

