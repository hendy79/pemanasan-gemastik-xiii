import java.util.Scanner;

//Prob D

public class SegitigaPythagorasPrimitif {
	public static void main(String[] args){
		int[][] daftar_primitif = new int[10000][3];
		Scanner input = new Scanner(System.in);

		String baris = input.nextLine();

		String[] mM = baris.split(" ", 2);
		
		int m = Integer.parseInt(mM[0]);
		int M = Integer.parseInt(mM[1]);
		boolean ulangi = true;
		int cnt = 0;
		int i = 0;
		
		if(m >= 0 && M >= m && M <= 10000 && (M-m) >= 0 &&  (M-m) <= 100){
			while(ulangi){
				boolean ulang_intern = true;
				int j = i + 1;
				while(ulang_intern){
					int k = j + 1;
					boolean ulang_intern1 = true;
					boolean addit = false;
					while(ulang_intern1){
						if((i+j+k) >= m && (i+j+k) <= M){
							int hit1 = i*i + j*j;
							int hit2 = k*k;
							if(hit1 == hit2){
								boolean insert = true;
								for(int x=0;x<cnt;x++){
									double bagi1 = i*1.0 / daftar_primitif[x][0];
									double bagi2 = j*1.0  / daftar_primitif[x][1];
									double bagi3 = k*1.0  / daftar_primitif[x][2];
									if(bagi1 == bagi2 && bagi2 == bagi3 && bagi3 == bagi1){
										insert = false;
										break;
									}
								}
								if(insert){
									daftar_primitif[cnt][0] = i;
									daftar_primitif[cnt][1] = j;
									daftar_primitif[cnt][2] = k;
									addit = true;
									cnt++;
									//System.out.println(i+" "+j+" "+k);
								}
							}
						}else if((i+j+k) > M){
							ulang_intern1 = false;
							break;
						}
						k++;
					}
					if((i+j+1+j+2) > M){
						ulang_intern = false;
						break;
					}
					j++;
				}
				if((i+i+1+i+2) > M){
					ulangi = false;
					break;
				}
				i++;
			}
			System.out.println(cnt);
		}
		
	}
}