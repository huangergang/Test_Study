package test.com.javaSE1.fifthUnit;

import java.lang.reflect.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
//
//        Class<?> cls1 = Double.class;
//
//        Field[] fields = cls1.getFields();
//        for (Field field : fields) {
//            System.out.printf("Name: %-20s", field.getName());
//            System.out.printf("Type: %-20s", field.getType());
//            System.out.println();
//        }
//
//        Method[] methods = cls1.getMethods();
//        for (Method method : methods) {
//            System.out.printf("Name: %-22s", method.getName());
//            Parameter[] parameters = method.getParameters();
//            AnnotatedType annotatedReturnType = method.getAnnotatedReturnType();
//            for (Parameter p : parameters) {
//                System.out.printf("Parameter: %-22s ", p);
//            }
//            System.out.printf("ReturnType: %44s", annotatedReturnType);
//            System.out.println();
//        }
//
//        Class<Print> printClass = Print.class;
//        Print print = printClass
//                .getDeclaredConstructor(String.class)
//                .newInstance("print1");
//
//        print.print();



//        int modifiers = printClass.getModifiers();
//        System.out.println(Modifier.isAbstract(modifiers));
//
//        Method[] methods = Double.class.getMethods();
//        for (Method m :
//                methods) {
//            System.out.printf("Name: %-22s",m.getName());
//            System.out.printf("Modifier: %-22s",Modifier.toString(m.getModifiers()));
//            System.out.println();
//        }


    }
}

abstract class Food {
    private String name;
    private String type;
    private String desc;

    public Food(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Food(String name, String type, String desc) {
        this.name = name;
        this.type = type;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public void print() {
    }


}

class Apple extends Food {

    public Apple(String name, String type) {
        super(name, type);
    }

    public Apple(String name, String type, String desc) {
        super(name, type, desc);
    }

    @Override
    public void print() {
        System.out.println("Apple ... ");
    }

    @Override
    public String toString() {
        return "Apple：" +
                "name='" + super.getName() ;

    }
}