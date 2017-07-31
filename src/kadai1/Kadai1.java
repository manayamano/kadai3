package kadai1;

public class Kadai1 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			if(i%3==0 && i%4==0){
				System.out.print("◆ ");
			}else if(i%3==0){
				System.out.print("△ ");
			}else if(i%4==0){
				System.out.print("□ ");
			}else{
				System.out.print(i + " ");
			}
		}

	}

}
