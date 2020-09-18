import java.util.Scanner;

//Prob B

public class Hukuman {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String baris = input.nextLine();

		String[] ab = baris.split(" ", 2);
		
		long a = Integer.parseInt(ab[0]);
		long b = Integer.parseInt(ab[1]);

		if(a >= 1 && a <= b && b <= 1000000000000000000L){
			long res = 0;
			for(long i = a; i <= b; i++){
				res += i;
			}
			res %= 1000000007L;
			
			System.out.println(res);
		}
	}
}