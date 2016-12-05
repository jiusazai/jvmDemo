package jvmLearn.outOfMemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang.liu on 2016-12-02.
 *
 * @author yang.liu
 */
public class _001_Heap {
    static class heapObject {

    }

    public static void main(String[] args) {
        List<heapObject> list = new ArrayList<heapObject>();
        while (true) {
            list.add(new heapObject());
        }
    }
}
