package test.com.javaSE2.stream;

public enum Gender {

    MALE,
    FEMALE,
    UNKNOWN_GENDER; // 未知性别

    public static Gender of(String str) {
        if (str.equals("male") || str.equals("MALE") || str.equals("男"))
            return MALE;
        else if (str.equals("female") || str.equals("FEMALE") || str.equals("女"))
            return FEMALE;
        return null;
    }
}
