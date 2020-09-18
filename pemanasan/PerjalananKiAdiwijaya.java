import java.util.Scanner;

//Prob H

public class PerjalananKiAdiwijaya {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String baris = input.nextLine();
		String arah = input.nextLine();
		
		String[] xy = baris.split(" ", 2);
		
		int x = Integer.parseInt(xy[0]);
		int y = Integer.parseInt(xy[1]);
		
		
		if(arah.length()>=1 && arah.length()<=100){
			for(int i=(arah.length()-1);i>=0;i--){
				if(arah.charAt(i) == 'u'){
					y--;
				}else if(arah.charAt(i) == 't'){
					x--;
				}else if(arah.charAt(i) == 's'){
					y++;
				}else if(arah.charAt(i) == 'b'){
					x++;
				}
			}
			System.out.println(x+" "+y);
		}
	}
}