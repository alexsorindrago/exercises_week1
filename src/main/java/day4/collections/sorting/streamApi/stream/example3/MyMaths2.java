package day4.collections.sorting.streamApi.stream.example3;

public class MyMaths2 {

    private int x, y;

    public MyMaths2(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    //can call methods from Printable because it takes it as parameter
    public void doSum(Printable p) {
        int sum = x + y;
        p.doPrint(sum + "");
    }

}
