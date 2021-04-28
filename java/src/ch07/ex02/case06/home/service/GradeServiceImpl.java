package ch07.ex02.case06.home.service;

import ch07.ex02.case06.home.dao.GradeDao;
import ch07.ex02.case06.home.domain.Score;

public class GradeServiceImpl implements GradeService {
	private GradeDao gradeDao;

	public GradeServiceImpl(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}

	public void writeScore(Score score) {
		this.gradeDao.addScore(score);
	}

	public Score[] listScores() {
		Score[] scores = this.gradeDao.getScores();

		int sum = 0;
		int avg = 0;
		for (Score score : scores) {
			sum = score.getEng() + score.getKor() + score.getMath();
			avg = sum / 3;
			score.setSum(sum);
			score.setAvg(avg);
		}
		return scores;
	}
}
