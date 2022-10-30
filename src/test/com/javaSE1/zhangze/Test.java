package test.com.javaSE1.zhangze;


public class Test {
    public int id;
    public String name;

    Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Test clone() throws CloneNotSupportedException {
        return new Test(id,name);
    }

    public static void main(String[] args) throws Exception {
        Test t1 = new Test(1,"frank");
        Test t2 = (Test) t1.clone();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.hashCode() +"\n"+t2.hashCode());
    }

}
