package jvmLearn.outOfMemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang.liu on 2016-12-02.
 *
 * @author yang.liu
 */
public class _003_RunTimeConstantPoolOOM {
    public static void main(String[] args) {
        //使用List保持常量池的引用，避免Full GC 回收常量池的行为
        List<String> list = new ArrayList<String>();
        int i = 0;

        while (true) {
            list.add(String.valueOf(i++).intern());
        }

    }
}
