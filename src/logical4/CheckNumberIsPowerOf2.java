package logical4;

public class CheckNumberIsPowerOf2 {

	public static void main(String[] args) {
		int number = 14;
		if(number<=0){
			return;
		}
		while(number>1) {
			if(number%2!=0) {
				return;
			}
			number = number/2;
		}
		return;
	}

}
