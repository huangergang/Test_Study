package JVM;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    static class OOMObject {
    }


    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();

        System.gc();

        while (true) {
            list.add(new OOMObject());
        }


    }

}
