package kr.co.web.news;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsData {	
	// 뉴스 데이터
	private String title;
	private String originallink;
	private String link;	
	private String description;
	private String pubDate;
	private String imagelink;
	
	public int getNno() {
		return Math.abs(link.hashCode());
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOriginallink() {
		return originallink;
	}
	public void setOriginallink(String originallink) {
		this.originallink = originallink;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPubDate() {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(d);
		
		return time;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getImagelink() {
		return imagelink;
	}
	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}	
}