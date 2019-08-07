package problemset_four;

import java.util.ArrayList;

public class client_main {
    One o,f;
    public void main(String[] args){
        ArrayList<Two> pointList = new ArrayList<Two>();
        for(int i = 0; i<100; i++){
            Two s = new Two((Math.random()-100 *200), Math.random()-100 *200);
            pointList.add(s);
        }

        for(int i = 0; i<pointList.size(); i++){
            System.out.println("X : " + pointList.get(i).getX()+ "     Y : " + pointList.get(i).getX());
        }

        o = new One(10);
        f = new One(10);
        System.out.println(o.getRadius());
        o.setRadius(20);
        System.out.println(o.toString());
        if(o.isLargerThan(f)){
            System.out.println("true");
        }
    }
}
