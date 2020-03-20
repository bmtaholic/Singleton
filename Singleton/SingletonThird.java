package Singleton;

// ˫����ģʽ
// �̰߳�ȫ,�ӳٳ�ʼ��,���ַ�ʽ����˫������,��ȫ���ڶ��߳�������ܱ��ָ�����
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
// ˫�ؼ��ģʽ,�����������ж�,��һ����Ϊ�˱��ⲻҪ��ʵ��,�ڶ�����Ϊ�˽���ͬ��,������̵߳�����.
// ����singleton = new SingletonThird()����Ĵ�����JVM�п��ܻ������������,�ڶ��̷߳����´��ڷ���,ʹ��volatile����singletonʵ��������Ч���������
