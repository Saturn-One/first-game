package firstpackage;

public class Main {
	public static void main(String [] args){
		System.out.println("Application started!");
		Game ex = new Game();
		new Thread(ex).start();
	
	}
}
