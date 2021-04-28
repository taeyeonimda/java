package home2;

import java.time.LocalDate;

public class Documents {
	private String title;
	private	String contents;
	private LocalDate creativeDate;
	private int page;
	
	public LocalDate getCreativeDate() {
		return creativeDate;
	}
	public void setCreativeDate(LocalDate creativeDate) {
		this.creativeDate = creativeDate;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String toString() {
		return "제목: "+title +"\n내용: " + contents + "\n생성일: " + creativeDate + "\n페이지 : "
				+ page;
	}
	
}
