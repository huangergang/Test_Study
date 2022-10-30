package test.stream;

public class MyStream {

    private String txt = "";

    public String getTxt() {
        return txt;
    }


    public MyStream add(String txt) {

        this.txt += txt;

        return this;
    }

    public static void main(String[] args) {

        MyStream myStream = new MyStream();
        myStream.add("hello ").add("world").add(" !");
        System.out.println(myStream.getTxt());

    }

}
