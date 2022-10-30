package test.instance;

public class Second {

    private static Second INSTANCE;

    private Second() {
    }

    public static Second getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Second();
        }
        return INSTANCE;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
