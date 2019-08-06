public class problemset_three {
public void main(String[]args) {
    max(10,30,20);
}
//1
        //a
    public int max ( int a, int b, int c){

        int resultA = Math.max(a, b);
        int resultB = Math.max(b, c);
        int resultC = Math.max(c, a);

        if (resultA == resultB) {
            return Math.max(resultA, resultC);
        } else if (resultA == resultC) {
            return Math.max(resultA, resultB);
        } else if (resultB == resultC) {
            return Math.max(resultB, resultA);
        } else {
            return 0;
        }

    }
        //b
    public double average(int a, int b){
        return (((double)(a))+((double)(b)))/2;
    }
        //c
    public void displayNTimes(String a, int b){
        for(int i = 0; i <b; i++){
            System.out.println(a);
        }

    }
        //d
    public String getRepeatedMessage(String a, int b){
        String msg = "";
        for(int i = 0; i <b; i++){
            msg+=a;
        }
        return msg;
    }
//2
        // a
    public int max(int a, int b, int c, int d){
        return Math.max(a, max(b,c,d));
    }



}
