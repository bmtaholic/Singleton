package Singleton;

// ��̬�ڲ��൥��ģʽ
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
// ֻ��һ�ε���getInsatance����ʱ,������ż���Inner����ʼ��instance,ֻ��һ���߳̿��Ի�ö���ĳ�ʼ����,�����߳��޷���ʼ��,��֤�����Ψһ��
// Ŀǰ�˷�ʽ�����е���ģʽ�����Ƽ���ģʽ