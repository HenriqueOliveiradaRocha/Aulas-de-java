package matrizmult;

public class Matrizmult {
		public static void main (String[] args) {
			int multi=1;
			int j=1;
			int matrizmulti[][] = new int [3][3];
			
			matrizmulti[0][0]= 1;
			matrizmulti[0][1]= 10;
			matrizmulti[0][2]= 20;
			
			matrizmulti[1][0]= 2;
			matrizmulti[1][1]= 20;
			matrizmulti[1][2]= 40;
			
			matrizmulti[2][0]= 3;
			matrizmulti[2][1]= 52;
			matrizmulti[2][2]= 74;
			
			for(int i=0; i<=2; i++) {
				if(i==0) {
					j= i+2;
					multi=matrizmulti[i][j]*multi;
				}
				if(i==1) {
					j=i;
					multi=matrizmulti[i][j]*multi;
				}
				if(i==2) {
					j=i-2;
					multi=matrizmulti[i][j]*multi;
				}
			}
			System.out.print(" 1 10 20\n 2 20 40 \n 3 52 74\n");
			System.out.println("O valor da multiplicação na diagonal inversa é: "+multi);
		}
}
