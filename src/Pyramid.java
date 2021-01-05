import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("피라미드 층수를 입력하세요.");
		int rows = scanner.nextInt();
		System.out.println("");
		
		
		for (int i=1; i<=rows; i++){
			  for (int j=1; j<=(rows-i)*2; j++){
			  System.out.print(" ");
			  }
			for (int k=i; k>=1; k--){
			  System.out.print(" "+"*");        
			}                                        
			for (int l=2; l<=i; l++){
			  System.out.print(" "+"*");   
			}                           
			System.out.println();
			}scanner.close();
		}
	}

