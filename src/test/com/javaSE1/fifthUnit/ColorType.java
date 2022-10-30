package test.com.javaSE1.fifthUnit;

public enum ColorType {
    RED(1,"红色"),
    GREEN(2,"绿色"),
    YELLOW(3,"黄色"),
    WHITE(4,"白色");

    public int code;
    public String desc;


    ColorType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
