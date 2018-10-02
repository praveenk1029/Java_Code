package proj1;

public class SingletonApp {

	public static void main(String[] args) {
		Singleton s = Singleton.getSingletonInstance();
		System.out.println("Fetching Singleton obj from SingletonApp:::::"+s);
	}

}
