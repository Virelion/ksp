// TEST PROCESSOR: DeclaredProcessor
// EXPECTED:
// Base class declared functions:
// subFun
// Sub class declared functions:
// baseFun
// JavaSource class declared functions:
// javaSourceFun
// END
// MODULE: module1
// FILE: lib.kt
open class Base {
    fun baseFun() {}
}
// MODULE: main(module1)
// FILE: sub.kt
class Sub: Base() {
    fun subFun() {}
}

// FILE: JavaSource.java
public class JavaSource {
    public int javaSourceFun() {
        return 1
    }
}
