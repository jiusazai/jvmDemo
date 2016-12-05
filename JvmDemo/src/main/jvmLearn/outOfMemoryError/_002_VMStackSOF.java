package jvmLearn.outOfMemoryError;

/**
 * Created by yang.liu on 2016-12-02.
 *
 * @author yang.liu
 */
public class _002_VMStackSOF {
    private int stackLength = 1;

    public void stackLink() {
        stackLength++;
        stackLink();
    }

    public static void main(String[] args) {
        _002_VMStackSOF sof=new _002_VMStackSOF();

        try {
            sof.stackLink();
        } catch (Exception e) {
            System.out.println("stack length :"+sof.stackLength);
            e.printStackTrace();
        }
    }
}
