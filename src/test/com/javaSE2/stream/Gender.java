package test.com.javaSE2.stream;

public enum Gender {

    MALE,
    FEMALE,
    UNKNOWN_GENDER; // δ֪�Ա�

    public static Gender of(String str) {
        if (str.equals("male") || str.equals("MALE") || str.equals("��"))
            return MALE;
        else if (str.equals("female") || str.equals("FEMALE") || str.equals("Ů"))
            return FEMALE;
        return null;
    }
}
