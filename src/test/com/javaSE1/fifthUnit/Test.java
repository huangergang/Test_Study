package test.com.javaSE1.fifthUnit;

import java.lang.reflect.*;

public class Test {

    public static Object copyOf(Object a, int newLength) {
        Class<?> aClass = a.getClass();
        if (!aClass.isArray()) return null;
        Class<?> componentType = aClass.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }

    public static void main(String[] args) throws Exception {

//        Class<?> cls1 = Object.class;
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

//        Class<Print> printClass = Print.class;
//        Constructor<Print> declaredConstructor = printClass.getDeclaredConstructor(String.class);
//        declaredConstructor.setAccessible(true);
//        Print print = declaredConstructor.newInstance("hello");
//
//        print.print();

//        String[] list = {"1", "2", "3", "4", "5"};
//        System.out.println(list.length);
//        list = (String[]) copyOf(list, 10);
//        System.out.println(list.length);

//        int modifiers = printClass.getModifiers();
//        System.out.println(Modifier.isAbstract(modifiers));

        Method[] methods = Double.class.getMethods();
        for (Method m :
                methods) {
            System.out.printf("Name: %-22s",m.getName());
            System.out.printf("Modifier: %-22s",Modifier.toString(m.getModifiers()));
            System.out.println();
        }


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
                "name='" + super.getName();

    }
}