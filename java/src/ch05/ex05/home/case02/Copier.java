package ch05.ex05.home.case02;

public class Copier {
	public Document copy (Document srcDoc) {
		Document destDoc = new Document();
		destDoc.setTitle(srcDoc.getTitle());
		destDoc.setContents(srcDoc.getContents());
		destDoc.setCreativeDate(srcDoc.getCreativeDate());
		destDoc.setPageNum(srcDoc.getPageNum());
		return destDoc;
	}
}
