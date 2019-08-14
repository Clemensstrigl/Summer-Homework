package problemset_six.problem_one;

public class Main {
    public static void main(String[] args) {
        Path path = new Path();
        path.addPoint(0, 0);
        path.addPoint(0, 10);
        path.addPoint(10, 10);
        path.addPoint(10, 0);
        path.addPoint(0, 0);
        System.out.println("Length of path is: " + path.getLength());
    }

}