package test.Serialization;

import java.io.*;

public class Test {

    public static void main(String[] args) throws Exception {

        Serialization s = new Serialization();
        s.setId(3);
        s.setId2(4);
        Integer id2 = s.getId2();
        System.out.println("s = " + id2);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Test.ser"));

        oos.writeObject(s);

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.ser"));
//        Serialization s = (Serialization) ois.readObject();
//        System.out.println("s = " + s);
//        System.out.println(s.getId());
//        System.out.println(s.getId2());

    }
}

class Serialization implements Serializable {

    private transient Integer id;
    private static Integer id2;

    public native Integer getId2();

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
