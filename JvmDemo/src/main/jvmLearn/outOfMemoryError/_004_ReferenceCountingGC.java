package jvmLearn.outOfMemoryError;

/**
 * Created by yang.liu on 2016-12-02.
 *
 * @author yang.liu
 */
public class _004_ReferenceCountingGC {
    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        _004_ReferenceCountingGC objA = new _004_ReferenceCountingGC();
        _004_ReferenceCountingGC objB = new _004_ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }
}
