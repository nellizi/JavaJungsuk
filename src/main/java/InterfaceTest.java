import java.sql.SQLOutput;

class A {
    public void method(I i) {
        i.method();
    }
}

interface I {
    public void method();
}

class B implements I {
    public void method() {
        System.out.println("B클래스");
    }
}

class C implements I {
    public void method() {
        System.out.println("C클래스");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
    }
}
