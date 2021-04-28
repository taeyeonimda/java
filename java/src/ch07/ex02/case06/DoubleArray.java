package ch07.ex02.case06;

public class DoubleArray {
	public static void main(String[] args) {
		int[][] score = { // 2차원 배열
				{ 90, 90, 90 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } };
		System.out.println("번호 국어 영어 수학 합계 평균");
		System.out.println("================================");
		
		for(int i = 0; i<score.length; i++) {
			int sum = 0;
			System.out.print("  "+(i + 1)+"  ");// 번호에 1,2,3,4,5
			
			for(int j =0; j<score[i].length; j++) {
				sum+= score[i][j]; // i = 0 j=0 에서 j는 1씩증가
				System.out.printf("%4d", score[i][j]);
			}
			System.out.printf("%4d %3d\n", sum, sum / score[i].length);
		}
	}
}
