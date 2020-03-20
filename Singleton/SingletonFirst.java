package Singleton;

// 懒汉模式
// 线程不安全 延迟初始化,严格意义上不是单例模式
public class SingletonFirst {
	// 构造器私有化
	private SingletonFirst() {
	}

	// 持有自己类型的属性
	private static SingletonFirst instance;

	// 对外提供获取实例的静态方法

	public static SingletonFirst getInstance() {
		if (instance == null) {
			instance = new SingletonFirst();
		}
		return instance;
	}
}
