import javax.swing.*;

public class problemset_two {
//0
    public void operator(){
        boolean even;
        boolean three;
        for(int i = 0; i<100; i++){
            even = false;
            three = false;

            if(i%2 == 0 && i%3 == 0){
                System.out.println("WONK");
                even = true;
                three = true;
            }
            if(i %2 == 0 && three == false){
                System.out.println("*" + i);
                even = true;
            }
            if(i %3 == 0 && even == false){
                System.out.println(i + " hi");
                three = true;
            }
            if(even == false && three == false){
                System.out.println(i);
            }

        }
    }
//1
    public void GuessTheNumber(int guess){
        int num1 = (int)(Math.random()*21);
        int num2 = (int)(Math.random()*21);
        int smaller,bigger;
        System.out.println("Number guessed : " + guess);
        if(num1 < num2){
            smaller = num1;
            bigger = num2;
        }
        else{
            smaller = num2;
            bigger = num1;
        }

        if(smaller <guess && bigger<guess){
            System.out.println(smaller + " " + guess + " " +bigger + "       WINNER!!!");
        }
        else if(smaller > guess){
            System.out.println(guess + " " + smaller + " " + bigger);

        }
        else if(bigger < guess){
            System.out.println(smaller + " " + bigger + " " + guess);
        }
    }
//2
    public void Shorter(int n, boolean f){
      //a1
        if(n<= 0){
            GuessTheNumber(n);
        }
        //a2
        if( f == false){
            GuessTheNumber(n);
        }
        //b
        method1();
        z = method2();
        if(x>0){
            x = -x;
        }
        else{
            x++;
        }
        //c
        int[] a = new int[9];
        for(int i = 3; i<12; i++){
            a[i-3] = i*10;
        }
    }
//3
    public void tableOutput(){
        for(int i = 0; i< 20; i++){
            System.out.println("f(" + i + ") = " + ((2*(i*i*i)) - i +1));
        }
    }
//6
    public void nestedLoop(){
        //a It will only display 5 on the same line five times\
        //b
        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //c
        int num;
        for (int i = 0; i < 5; i++) {
            num = i;
            for (int j = 0; j < i; j++) {

                System.out.print(num + " ");
                num --;
                if (num < 0){
                    num = 0;
                }
            }
            System.out.println();
        }
    }

//7
    public void starTriangle(int x){
        int y = x;
        for(int i = 0; i<x;i++){
            for(int j = 0; j<y; j++){
                System.out.print("*");
            }
            System.out.println();
            y--;
        }
    }

//8
    public void AllOneDice(){
       int a,b,c,Counter = 0;
        do{
            a = (int)(Math.random()*6+1);
            b = (int)(Math.random()*6+1);
            c = (int)(Math.random()*6+1);
            Counter++;
        }while(a != 1 && b != 1 && c != 1);
        System.out.println("it took " + Counter + " tries to get all ones on three dice");
    }

//9
    public void testNumber(){
        int y;
        do{
            String response = JOptionPane.showInputDialog("type a number between 10 and 15");
             y = Integer.parseInt(response);
        }while(y>15 || y<10 && y%2 == 0);
    }

    //10
    public void WhileAsFor(){
        int num = 10;
        do{
            System.out.println("Num is: " + num);
            num--;
        }while(num>2);
    }

    public void Bonus(int n){
        int total = 2*n+1;
        for(int i = 0; i>total;i++){
            for(int j = 0; j>total;j++){
                if(j==i|| j+i== total-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
