package cat;

public class CatRunner {
public static void main(String[] args) {
	Cat Jim = new Cat("jim");
	Jim.meow();
	Jim.printName();
	for (int i = 0; i<9; i++) {
		Jim.kill();
	}
}
}
