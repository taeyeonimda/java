package ch07.ex02.case06.home;

import ch07.ex02.case06.home.dao.GradeDao;
import ch07.ex02.case06.home.dao.GradeDaoImpl;
import ch07.ex02.case06.home.domain.Score;
import ch07.ex02.case06.home.presentation.Console;
import ch07.ex02.case06.home.presentation.GradeIo;
import ch07.ex02.case06.home.service.GradeService;
import ch07.ex02.case06.home.service.GradeServiceImpl;

public class Main {
	public static void main(String[] args) {
		Console.info("성적관리를 시작합니다");

		int studentCnt = 0;
		Score[] scores;

		studentCnt = Console.inNUm("학생수를 입력하세요.");
		scores = new Score[studentCnt];

		GradeDao gradeDao = new GradeDaoImpl(scores);
		GradeService gradeService = new GradeServiceImpl(gradeDao);
		GradeIo gradeIo = new GradeIo(gradeService);

		gradeIo.play(studentCnt);

		Console.info("성적관리앱을 종료합니다.");

	}
}
