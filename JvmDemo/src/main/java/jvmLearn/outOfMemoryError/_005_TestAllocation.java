package jvmLearn.outOfMemoryError;

/**
 * Created by lianshang on 2016/12/5.
 */
public class _005_TestAllocation {
    private static final int _1MB = 1024 * 1024;


    public static void main(String[] args) {
        byte[] allcation1, allcation2, allcation3, allcation4;
        allcation1 = new byte[2 * _1MB];
        allcation2 = new byte[2 * _1MB];
        allcation3 = new byte[2 * _1MB];
        allcation4 = new byte[4 * _1MB];
    }
}
