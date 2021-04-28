package ch07.ex02.case03;

public class MaxMin {
	public static void main(String[]args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i =1; i<score.length; i++) {
			if(score[i]>max) max = score[i];//max에 score 79부터 값이들어가고 다음수가 크면 교체 작으면 그만바꿈
			if(score[i]<min) min= score[i];//min에 score79부터 값이 들어가고 다음수가 작으면 교체 크면 그만바꿈
		}System.out.printf("max : %d, min : %d",max,min);
	}
}
