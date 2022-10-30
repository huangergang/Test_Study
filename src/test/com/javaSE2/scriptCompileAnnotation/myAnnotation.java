package test.com.javaSE2.scriptCompileAnnotation;

public @interface myAnnotation {

    int number() default 8;

    String name() default "";

    byte print() default 1;

}
