package Thread.ThreadLocal;

/**
 * 全局用户InheritableThreadLocal变量
 */
public class StaticThreadLocal {

	private static InheritableThreadLocal<String> userName = new InheritableThreadLocal<>();

	public static String getUserName() {
		return userName.get();
	}
	public static void setUserName(String s) {
		userName.set(s);
	}
}
