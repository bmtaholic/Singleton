package Singleton;

// 双重锁模式
// 线程安全,延迟初始化,这种方式采用双锁机制,安全且在多线程情况下能保持高性能
public class SingletonThird {
	private volatile static SingletonThird singleton;

	private SingletonThird() {
	}

	private static SingletonThird getsingleton() {
		if (singleton == null) {
			synchronized (SingletonThird.class) {
				if (singleton == null) {
					singleton = new SingletonThird();
				}
			}
		}
		return singleton;
	}
}
// 双重检查模式,进行了两次判断,第一次是为了避免不要的实例,第二次是为了进行同步,避免多线程的问题.
// 由于singleton = new SingletonThird()对象的创建在JVM中可能会进行重新排序,在多线程访问下存在风险,使用volatile修饰singleton实例变量有效解决该问题
