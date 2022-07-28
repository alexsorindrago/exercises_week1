package day4.collections.sorting.streamApi.stream.example3;

public class MyMaths implements Printable {

    private int x, y;

    public MyMaths(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int doSum() {
        return x + y;
    }


    @Override
    public int doPrint(String msg) {
        int sum = this.x + this.y;
        System.out.println(msg + "" + sum);
        return (sum + "").length();

    }
}
