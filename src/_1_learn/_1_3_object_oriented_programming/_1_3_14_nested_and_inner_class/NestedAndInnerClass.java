package _1_learn._1_3_object_oriented_programming._1_3_14_nested_and_inner_class;

class OuterClass { // Outer Class
    class NestedClass { // Inner Class

    }
}

class OuterClass2 { // Outer Class
    class NestedClass { // Nested Class

    }
}

class OuterClass3 { // Outer Class
    class InnerClass { // Inner Class

    }

    static class StaticNestedClass { // Static Nested Class

    }
}

/* In Java, Only nested classes are allowed to be static! */

public class NestedAndInnerClass {
    public static void main(final String[] ARGUMENTS) {
        OuterClass.NestedClass nestedClass = new OuterClass().new NestedClass();

        OuterClass3.InnerClass innerClass = new OuterClass3().new InnerClass();
        OuterClass3.StaticNestedClass staticNestedClass = new OuterClass3.StaticNestedClass();
    }
}