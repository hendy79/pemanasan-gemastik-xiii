import java.util.Scanner;

//Prob A

public class SeberapaJauhkah {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String baris1 = input.nextLine();
		String baris2 = input.nextLine();

		String[] xy1 = baris1.split(" ", 2);
		String[] xy2 = baris2.split(" ", 2);
		
		int x1 = Integer.parseInt(xy1[0]);
		int y1 = Integer.parseInt(xy1[1]);
		int x2 = Integer.parseInt(xy2[0]);
		int y2 = Integer.parseInt(xy2[1]);
		
		if(x1 <= 50000 && x2 <= 50000 && y1 <= 50000 && y2 <= 50000
				&& x1 >= -50000 && x2 >= -50000 && y1 >= -50000 && y2 >= -50000){
			int jarak_terpendek = (y2-y1) + (x2-x1);
			
			System.out.println(jarak_terpendek);
		}
	}
}