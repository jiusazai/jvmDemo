package jvmLearn.outOfMemoryError;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;

/**
 * Created by yang.liu on 2016-12-12.
 *
 * @author yang.liu
 */
public class _007_ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
         ClassLoader myloader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";

                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };
        //同一个类不同加载器加载
        Object obj=myloader.loadClass("jvmLearn.outOfMemoryError._007_ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof jvmLearn.outOfMemoryError._007_ClassLoaderTest);
    }

}
