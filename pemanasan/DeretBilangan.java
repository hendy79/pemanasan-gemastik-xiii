import java.util.Scanner;

//Prob F

public class DeretBilangan {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int[] deretB = new int[N];
		
		for(int i=0;i<N;i++){
			deretB[i] = input.nextInt();
			if(i < 0 || i > 1000000000){
				System.exit(0);
			}
		}
		
		boolean stop = false;
		int probC = -1;
		int cStart = deretB[0]*2;
		
		do{
			probC++;
			cStart--;
			int iterate = 1;
			int[] cTmpArr = new int[N+1];
			cTmpArr[0] = cStart;
			while(iterate<=N){
				cTmpArr[iterate] = deretB[iterate-1] * 2 - cTmpArr[iterate-1];
				if(cTmpArr[iterate] < cTmpArr[iterate-1]){
					stop = true;
					break;
				}
				iterate++;
			}
		}while(!stop);
		System.out.println(probC);
	}
}
