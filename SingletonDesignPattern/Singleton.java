package SingletonDesignPattern;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private volatile static Singleton singletonObject;
    private Singleton(){
        if (singletonObject != null) {
            throw new IllegalStateException("Object Already Exist");
        }
    }
    public static Singleton getInstance() {
        if (singletonObject == null) {
            synchronized (singletonObject) {
                if (singletonObject == null) {
                    return new Singleton();
                }
            }
        }
        return singletonObject;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return singletonObject;
    }
}

// ProtoType pattern is used where we need to create multiple object of similar type and the creation is slow and expensive.
// For this purpose implement the cloneable interface and return the super().clone();