package ch07.home;

import ch07.home.presentation.Console;
import ch07.home.presentation.GradeIo;
import ch07.home.dao.GradeDao;
import ch07.home.dao.GradeDaoImpl;
import ch07.home.service.GradeService;
import ch07.home.service.GradeServiceImpl;

public class Main {
	public static void main(String[] args) {
		Console.info("성적 관리 앱을 시작합니다");
		
		GradeDao gradeDao = new GradeDaoImpl();
		GradeService gradeService = new GradeServiceImpl(gradeDao);
		GradeIo gradeIo = new GradeIo(gradeService);
		
		gradeIo.play();
		
		Console.info("성적 관리 앱을 종료합니다.");
		
	}
}
