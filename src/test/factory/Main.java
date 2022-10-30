package test.factory;

public class Main {

    private String id;

    private String name;

    private String desc;

    private Main() {
    }

    public Main setId(String id) {
        this.id = id;
        return this;
    }

    public Main setName(String name) {
        this.name = name;
        return this;
    }

    public Main setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Main build() {
        return new Main();
    }

    @Override
    public String toString() {
        return "Main{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }


}
