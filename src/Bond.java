
public class Bond {
	Bond() {
	
		
}
	

int findCode(Vault code) {
	
	for(int i = 0; i<=1000000;i++) {
		if (code.tryCode(i)) {
			return i;
			
			}
		}
		return -1;
}
}



















