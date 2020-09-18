import java.util.Scanner;

//Prob E

public class Suten {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String baris1 = input.nextLine();
		String baris2 = input.nextLine();

		String[] eko = baris1.split(" ");
		String[] ganesh = baris2.split(" ");
		
		int p_eko = 0;
		int p_ganesh = 0;

		if(eko.length == ganesh.length && eko.length <= 100){
			for(int i=0;i<eko.length;i++){
				if(eko[i].equals("e") && ganesh[i].equals("h")){
					p_eko++;
				}else if(eko[i].equals("h") && ganesh[i].equals("a")){
					p_eko++;
				}else if(eko[i].equals("a") && ganesh[i].equals("e")){
					p_eko++;
				}else if(eko[i].equals("h") && ganesh[i].equals("e")){
					p_ganesh++;
				}else if(eko[i].equals("a") && ganesh[i].equals("h")){
					p_ganesh++;
				}else if(eko[i].equals("e") && ganesh[i].equals("a")){
					p_ganesh++;
				}
			}
			if(p_eko > p_ganesh){
				System.out.println("Eko wins");
			}else if(p_eko < p_ganesh){
				System.out.println("Ganesh wins");
			}else{
				System.out.println("Draw");
			}
		}
		
	}
}
