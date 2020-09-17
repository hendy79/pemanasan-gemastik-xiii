import java.util.Scanner;

//Prob G

public class PersegiPanjang {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int[][] persegi = new int[N][4];
		input.nextLine();
		
		if(N>=1 && N<=10000){
			for(int i=0;i<N;i++){
				String baris = input.nextLine();
				String[] xypp = baris.split(" ");
				for(int x=0;x<4;x++){
					persegi[i][x] = Integer.parseInt(xypp[x]);
				}
			}
		}else{
			System.exit(0);
		}
		
		int tidakDib = 0;
		for(int i=0;i<N-1;i++){
			for(int j=i+1;j<N;j++){
				int panjangI = persegi[i][2] - persegi[i][0];
				int lebarI = persegi[i][3] - persegi[i][1];

				int panjangJ = persegi[j][2] - persegi[j][0];
				int lebarJ = persegi[j][3] - persegi[j][1];
				
				if(!((panjangI <= panjangJ && lebarI <= lebarJ) || (panjangI <= lebarJ && lebarI <= panjangJ))){
					tidakDib++;
				}
			}
		}
		
		System.out.println(tidakDib);
	}
}
