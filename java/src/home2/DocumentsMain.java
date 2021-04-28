package home2;

import java.time.LocalDate;

public class DocumentsMain {
	public static void main(String[]args) {
		Documents doc = new Documents();
		doc.setTitle("태백산맥");
		doc.setContents("태백산맥은 높다.");
		doc.setCreativeDate(LocalDate.of(2019, 12, 11));
		doc.setPage(3);
		
		
		Copier copier = new Copier();
		Documents copyDoc = copier.Copy(doc);
		Documents copyDoc1 = copier.Copy(doc);
		Documents copyDoc2 = copier.Copy(doc);
		System.out.println(copyDoc);
		System.out.println();
		System.out.println(copyDoc2);
		System.out.println();
		System.out.println(copyDoc1);
	}
}
