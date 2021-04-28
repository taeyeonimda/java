package ch07.home.service;

import java.util.List;

import ch07.home.dao.GradeDao;
import ch07.home.domain.Score;

public class GradeServiceImpl implements GradeService{
	private GradeDao gradeDao; //dao 객체 생성
	
	public GradeServiceImpl(GradeDao gradeDao) {
		this.gradeDao = gradeDao; //
	}
	
	public void writeScore(Score score) {
		this.gradeDao.addScore(score);
	}
	
	public List<Score> listScores(){
		List<Score> scores = this.gradeDao.getScores();
		
		int sum = 0;
		int avg =0;
		for(Score score: scores) {
			sum = score.getKor()+score.getEng()+score.getMath();
			avg = sum/3;
			score.setSum(sum);
			score.setAvg(avg);
		}
		return scores;
		
	}
}
