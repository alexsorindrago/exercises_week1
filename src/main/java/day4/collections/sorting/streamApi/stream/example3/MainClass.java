package day4.collections.sorting.streamApi.stream.example3;

public class MainClass {

    public static void main(String[] args) {

        callMyMath();

        //provides the Printable as parameter in doSum to receive the message from interface
        callMyMath2();

        //using lambda
        callMyMatch3();
    }

    public static void callMyMath() {
        MyMaths abc = new MyMaths(10, 20);
        int lenght = abc.doPrint("Addition of 10 and 20 is ");
    }

    public static void callMyMath2() {
        MyMaths2 abc = new MyMaths2(10, 20);
        abc.doSum(new Printable() {
            @Override
            public int doPrint(String msg) {
                System.out.println("------>" + msg);
                return msg.length();
            }
        });
    }

    public static void callMyMatch3() {
        MyMaths3 abc = new MyMaths3(10, 20);
        abc.doSum(
                (msg) -> {
                    System.out.println("------>" + msg);
                    return msg.length();
                }
        );
    }
}

