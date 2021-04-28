package home2;

public class Copier {
	public Documents Copy(Documents orgDocuments) {
		Documents copyDoc = new Documents();
		copyDoc.setTitle(orgDocuments.getTitle());
		copyDoc.setContents(orgDocuments.getContents());
		copyDoc.setCreativeDate(orgDocuments.getCreativeDate());
		copyDoc.setPage(orgDocuments.getPage());
		return copyDoc;
	}
}
