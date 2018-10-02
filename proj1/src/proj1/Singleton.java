package proj1;

public class Singleton {
	
	private static Singleton singletonInstance;
	private Singleton() {
		
	}

	public static Singleton getSingletonInstance(){
		if (singletonInstance==null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
	//proj1.Singleton@15db9742
	public static void main(String[] args) {
		System.out.println("singletonInstance:::"+getSingletonInstance());
	}

}
