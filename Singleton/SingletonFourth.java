package Singleton;

// 静态内部类单例模式
public class SingletonFourth {
	private SingletonFourth() {
	}

	private static SingletonFourth getInstance() {
		return Inner.instance;
	}

	private static class Inner {
		private static final SingletonFourth instance = new SingletonFourth();
	}
}
// 只有一次调用getInsatance方法时,虚拟机才加载Inner并初始化instance,只有一个线程可以获得对象的初始化锁,其他线程无法初始化,保证对象的唯一性
// 目前此方式是所有单例模式中最推荐的模式