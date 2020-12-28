package test;

//object TestScala运行的一个具体流程（反编译过后）
public class TestScala {
    public static void main(String[] args) {
        TestScala$.Module$.main(args);
    }
}

final class TestScala${
    public static final TestScala$ Module$;

    static {
        Module$ = new TestScala$();
    }

    public static void main(String[] args) {
        System.out.println("hello scala~~");
    }
}
