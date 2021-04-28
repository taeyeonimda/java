package ch05.ex05.home.case02;

import java.time.LocalDate;

public class Document {
	private String title;
	private String contents;
	private LocalDate creativeDate;
	private int pageNum;
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
	public LocalDate getCreativeDate() {
		return creativeDate;
	}
	public void setCreativeDate(LocalDate creativeDate) {
		this.creativeDate = creativeDate;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	public String toString() {
		return String.format("제목: %s\n내용: %s\n작성일:%s\n페이지:%d", 
				title, contents, creativeDate, pageNum);
	}
}
