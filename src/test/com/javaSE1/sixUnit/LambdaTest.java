package test.com.javaSE1.sixUnit;

public class LambdaTest {


    public static void main(String[] args) {

//        new TestLambda(() -> {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("nb");
//            }
//        });

        Lambda a = (() -> {
            System.out.println("hello");
        });

        a.init();

//        ArrayList<String> list = new ArrayList<>();
//        list.add("frank");
//        list.add("rose");
//        list.add("alan");
//        list.add("joe");
//        list.removeIf(e -> e == "frank");
//        System.out.println("list = " + list);


    }
}

//class TestLambda {
//
//    public Lambda lambda;
//
//    public TestLambda(Lambda lambda) {
//        lambda.init();
//    }
//
//}