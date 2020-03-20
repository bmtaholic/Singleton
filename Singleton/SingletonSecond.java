package Singleton;

// 饿汉模式
// 线程安全,比较常用,但容易产生垃圾,因为一开始初始化
public class SingletonSecond {
	private static SingletonSecond instance = new SingletonSecond();

	private SingletonSecond() {
	}

	public static SingletonSecond getInstance() {
		return instance;
	}
}
