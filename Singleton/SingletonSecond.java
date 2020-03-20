package Singleton;

// ����ģʽ
// �̰߳�ȫ,�Ƚϳ���,�����ײ�������,��Ϊһ��ʼ��ʼ��
public class SingletonSecond {
	private static SingletonSecond instance = new SingletonSecond();

	private SingletonSecond() {
	}

	public static SingletonSecond getInstance() {
		return instance;
	}
}
