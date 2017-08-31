package kr.co.web.news;

import java.util.List;

public class NaverNews<E> {
	
	//애플리케이션 클라이언트 아이디값
	public static final String clientidKey = "X-Naver-Client-Id";
	public static final String clientIdValue = "H4HBbvkERiGJYWobU7Dj";
	//애플리케이션 클라이언트 시크릿값
	public static final String clientSecretKey = "X-Naver-Client-Secret"; 
	public static final String clientSecretValue = "VjtarKiv4X";
	//news url
	public static final String newsUrl = "https://openapi.naver.com/v1/search/news.json";
	public static final String imageUrl = "https://openapi.naver.com/v1/search/image";
	
	private String lastBuildDate;
	private int total;
	private int start;
	private int display;
	private List<E> items;	
	
	public String getLastBuildDate() {
		return lastBuildDate;
	}
	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getDisplay() {
		return display;
	}
	public void setDisplay(int display) {
		this.display = display;
	}
	public List<E> getItems() {
		return items;
	}
	public void setItems(List<E> items) {	
		this.items = items;
	} 
	
	public static void copyImage(List<NewsData> lhs, List<NewsImage> rhs) {
		int i = 0;
		for (NewsData val : lhs) {
			val.setImagelink(rhs.get(i).getThumbnail());
			i++;
		}
	}
}
