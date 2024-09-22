package design_pattern.singleton;

/**
 * As mentioned in Lazy Initialization if our get instance method invoked by two thread at the
 * same time then there are chances that two objects created, and we violate singleton pattern.
 * To avoid we have two choices :
 * 1. Create getinstance synchronized so that only one instance can invoke that method. However, disadvantage is lets say
 * there are 3 thread t1 is inside getinstance and t2,t3 waiting. Now t2 will get into method and simply return instance created by
 * t1 and t3 still waiting. So it had lead to unnecessary of locks.
 * <p>
 * 2. To avoid we have synchronized block which we will implement here.
 */
public class MultithreadSingleton
{
    private static MultithreadSingleton instance = null;

    private MultithreadSingleton() {

    }

    public static MultithreadSingleton getInstance() {
        if (instance == null) {
            // Our method is static, so we have class level locking here
            synchronized (MultithreadSingleton.class) {
                if (instance == null) {
                    instance = new MultithreadSingleton();
                }
            }
        }
        return instance;
    }
}
