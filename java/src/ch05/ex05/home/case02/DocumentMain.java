package ch05.ex05.home.case02;

import java.time.LocalDate;

public class DocumentMain {
	public static void main(String[]args) {
		Document doc = new Document();
		doc.setTitle("태백산맥");
		doc.setContents("빨치산도우리땅이다");
		doc.setCreativeDate(LocalDate.of(2019, 12, 12));
		doc.setPageNum(3);
		
		Copier copier = new Copier();
		Document copyDoc = copier.copy(doc);
		Document copyDoc1 = copier.copy(doc);
		System.out.println(copyDoc);
		System.out.println();
		System.out.println(copyDoc1);
	}
}
