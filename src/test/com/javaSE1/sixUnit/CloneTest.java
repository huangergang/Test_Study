package test.com.javaSE1.sixUnit;

public class CloneTest {

    public static void main(String[] args) throws Exception {

        Phone phone1 = new Phone("Huawei", "mate 30 pro", new Chip("Huawei", "Kirin 9000"));
        Phone phone2 = new Phone("Xiaomi", "13 pro", new Chip("Qualcomm", "Snapdragon 8gen 1"));

//        Phone phone1 = new Phone("Huawei", "mate 30 pro");
//        Phone phone2 = new Phone("Xiaomi", "13 pro");

        Phone clone = (Phone) phone1.clone();
        clone.setBrand("三星");
        clone.chip.setBrand("Dimensity");
//
        System.out.println(clone);
        System.out.println(phone1);


    }

}
