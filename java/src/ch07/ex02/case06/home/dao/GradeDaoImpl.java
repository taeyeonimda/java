package ch07.ex02.case06.home.dao;

import ch07.ex02.case06.home.domain.Score;

public class GradeDaoImpl implements GradeDao{
	private Score[] scores; // 스코어 배열타입의 변수 scores
	private int cursor; // 점수표에서 1,2 번호를 표시하는것
	
	public GradeDaoImpl(Score[] scores) {
		this.scores = scores;
	}
	
	public void addScore(Score score) {
		this.scores[this.cursor++] = score; 
	}
	
	public Score[] getScores() {
		return this.scores;
	}
}
