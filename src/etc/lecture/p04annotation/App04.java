package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@MyAnnotation04
public class App04 {
    @MyAnnotation04(name = "hong", age = 15)
    public void method() {

    }

    @MyAnnotation05(age = 99)
    public void method2() {

    }

    @MyAnnotation06(name = {"tremp", "홍"})
    public void method4() {
    }

    @MyAnnotation06(name = "tremp")
    public void method5() {
    }
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation07 {
//    String[] name() defalut "donal";

//    String address() defalut "seoul";

    int age();

    String value();

}


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation06 {
    String[] name();
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation05 {
    String address() default "busan";

    int age();
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04 {

    //element, attribute, 속성
    String name();

    int age();

}
