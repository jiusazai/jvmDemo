package jvmLearn.outOfMemoryError;

/**
 * Created by yang.liu on 2016-12-12.
 *
 * @author yang.liu
 */
public class _006_ClassLoaderDemo {
    public static void main(String[] args) {
        System.out.println(new _006_ClassLoaderDemo().getClass().getClassLoader());

        Singleton mysingleton = Singleton.GetInstence();
        System.out.println(mysingleton.a);
        System.out.println(mysingleton.b);
    }
}

class Singleton {

//    public static Singleton singleton = new Singleton();
//    public static int a;
//    public static int b = 0;


    public static int a;
    public static int b = 0;
    public static Singleton singleton = new Singleton();

    private Singleton() {
        super();
        a++;
        b++;
    }

    public static Singleton GetInstence() {
        return singleton;
    }

}