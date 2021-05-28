public class B implements AB {
    @Override
    public void foo() {
        System.out.println("B.foo");
    }

    void aFoo() {
        AB.super.foo();
    }

    public static void main(String[] args) {
        B b = new B();
        b.foo();
        b.aFoo();
    }
}

interface AB {
    default void foo() {
        System.out.println("A.foo");
    }
}