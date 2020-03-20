package Singleton;

// ����ģʽ
// �̲߳���ȫ �ӳٳ�ʼ��,�ϸ������ϲ��ǵ���ģʽ
public class SingletonFirst {
	// ������˽�л�
	private SingletonFirst() {
	}

	// �����Լ����͵�����
	private static SingletonFirst instance;

	// �����ṩ��ȡʵ���ľ�̬����

	public static SingletonFirst getInstance() {
		if (instance == null) {
			instance = new SingletonFirst();
		}
		return instance;
	}
}
