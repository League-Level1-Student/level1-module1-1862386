
public class Vault {
	int code;
public static void main(String[] args) {
	
	Vault jim = new Vault(7);
	Bond james = new Bond();
	System.out.println(	james.findCode(jim));


}
Vault(int code) {

	this.code = code;

	System.out.println("Hi");
}
boolean tryCode(int code) {
	if (code == this.code) {
		return true;
	}
	else {
		return false;
	}
}
}
