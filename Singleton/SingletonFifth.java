package Singleton;

// 枚举单例模式
public enum SingletonFifth {
	INSTANCE;
}
// 默认枚举实例的创建是线程安全的,并且在任何情况下都是单例的
// 实际上 1,枚举类型隐藏了私有的构造器 2,枚举类的域是相应类型的一个实例对象
