package ch07.home.dao;

import java.util.List;

import ch07.home.domain.Score;

public interface GradeDao {
	void addScore(Score score); // 국영수 점수 더하기
	
	List<Score> getScores(); // 점수표 읽기get하기 점수표는 List<Score>타입
}
