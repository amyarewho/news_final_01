package kr.co.web.news;

public class NewsImage {
	// 뉴스 이미지 관련 데이터
	private String title;
	private String link;
	private String thumbnail;
	private int sizeheight;
    private int sizewidth;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public int getSizeheight() {
		return sizeheight;
	}
	public void setSizeheight(int sizeheight) {
		this.sizeheight = sizeheight;
	}
	public int getSizewidth() {
		return sizewidth;
	}
	public void setSizewidth(int sizewidth) {
		this.sizewidth = sizewidth;
	}        
}
