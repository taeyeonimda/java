package ch07.home.dao;

import java.util.ArrayList;
import java.util.List;

import ch07.home.domain.Score;

public class GradeDaoImpl implements GradeDao{
	private List<Score> scores; // 점수표 선언
	

	public GradeDaoImpl() {
		this.scores = new ArrayList<>(); // List<Score> score 점수표에 ArrayList 배열 타입 저장
	}
	
	public void addScore(Score score) {
		scores.add(score); // 배열타입에 국영수등 점수 저장
	}
	
	public List<Score> getScores(){
		return scores;	
	}
}
