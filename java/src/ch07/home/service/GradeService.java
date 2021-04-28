package ch07.home.service;

import java.util.List;

import ch07.home.domain.Score;

public interface GradeService {

	void writeScore(Score score); // 점수를 기록

	List<Score> listScores(); // 점수표 보기 읽기
}
