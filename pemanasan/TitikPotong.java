import java.util.Scanner;

//Prob C

public class TitikPotong {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String baris1 = input.nextLine();
		String baris2 = input.nextLine();
		String baris3 = input.nextLine();
		String baris4 = input.nextLine();

		String[] xya1 = baris1.split(" ", 2);
		String[] xya2 = baris2.split(" ", 2);
		String[] xyb1 = baris3.split(" ", 2);
		String[] xyb2 = baris4.split(" ", 2);
		
		double xa1 = Double.parseDouble(xya1[0]);
		double ya1 = Double.parseDouble(xya1[1]);
		double xa2 = Double.parseDouble(xya2[0]);
		double ya2 = Double.parseDouble(xya2[1]);
		double xb1 = Double.parseDouble(xyb1[0]);
		double yb1 = Double.parseDouble(xyb1[1]);
		double xb2 = Double.parseDouble(xyb2[0]);
		double yb2 = Double.parseDouble(xyb2[1]);
		
		if(xa1 >= -1000000 && ya1 >= -1000000 && xa2 >= -1000000 && ya2 >= -1000000
			&& xb1 >= -1000000 && yb1 >= -1000000 && xb2 >= -1000000 && yb2 >= -1000000
			&& xa1 <= 1000000 && ya1 <= 1000000 && xa2 <= 1000000 && ya2 <= 1000000
			&& xb1 <= 1000000 && yb1 <= 1000000 && xb2 <= 1000000 && yb2 <= 1000000){
			
			double gradien1 = (ya2-ya1) / (xa2-xa1);
			double k1 = gradien1 * xa1 - ya1;
			String garis1 = gradien1+"x"+k1;

			double gradien2 = (yb2-yb1) / (xb2-xb1);
			double k2 = gradien2 * xb1 - yb1;
			String garis2 = gradien2+"x"+k2;
			
			if(garis1.equals(garis2)){
				System.out.println("GARIS SAMA");
			}else{
				if(gradien1 == gradien2){
					System.out.println("SEJAJAR");
				}else{
					double x = gradien2-gradien1;
					double dk = k2-k1;
					double potongx = dk / x;
					double potongy = gradien1 * potongx - k1;
					
					System.out.println(String.format("%.2f", potongx)+" "+String.format("%.2f", potongy));
				}
			}
		}
	}
		
}
