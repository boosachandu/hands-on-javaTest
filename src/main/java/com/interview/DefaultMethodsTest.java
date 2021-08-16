package com.interview;

interface A {
    void a();

   // void b();

    default int method1() {
        return 0;
    }
}

interface B {
    void b();

    default int method1() {
        return 1;
    }
}

class DefaultMethodsTest implements A, B {

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public int method1() {
        return B.super.method1();
    }

}
