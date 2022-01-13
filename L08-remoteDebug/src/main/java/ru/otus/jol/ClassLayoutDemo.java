package ru.otus.jol;

import org.openjdk.jol.info.ClassData;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

//-XX:ObjectAlignmentInBytes=256
//-XX:-UseCompressedOops -XX:-UseCompressedClassPointers
public class ClassLayoutDemo {
    public static void main(String[] args) {
        new ClassLayoutDemo().demo();
    }

    public void demo() {

        //Какой будет результат?
       // System.out.println("boolean:" + VM.current().sizeOfField("boolean"));
        //Как этот результат получился?

        //System.out.println(VM.current().details());

        //System.out.println(ClassLayout.parseInstance(new TestB()).toPrintable());

        System.out.println(ClassLayout.parseClass(TestB.class).toPrintable());
        //System.out.println(ClassLayout.parseClass(TestB2.class).toPrintable());
        //System.out.println(ClassLayout.parseClass(TestB4.class).toPrintable());
        //System.out.println(ClassLayout.parseClass(TestInt.class).toPrintable());

        //System.out.println(ClassLayout.parseClass(TestInt2.class).toPrintable());
        //System.out.println(ClassLayout.parseClass(TestInt4.class).toPrintable());

        //System.out.println(ClassLayout.parseClass(Mix.class).toPrintable());
    }

    public static class TestB {
        boolean valBool;
    }

    public static class TestB2 {
        boolean valBool1;
        boolean valBool2;
    }

    public static class TestB4 {
        boolean valInt1;
        boolean valInt2;
        boolean valInt3;
        boolean valInt4;
    }

    public static class TestInt {
        int valInt1;
    }

    public static class TestInt2 {
        int valInt1;
        int valInt2;
    }

    public static class TestInt4 {
        int valInt1;
        int valInt2;
        int valInt3;
        int valInt4;
    }

    public static class Mix {
        boolean boolVal;
        int intVal;
        boolean isBoolVal;
    }
}
