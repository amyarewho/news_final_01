package kr.co.web.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.type.TypeReference;

import kr.co.web.news.NaverNews;
import kr.co.web.news.NewsData;
import kr.co.web.news.NewsImage;
import kr.co.web.news.OpenJsonAPI;

@Controller
public class SearchController {
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search(Locale locale, HttpServletRequest req) {
		
		ModelAndView mav = new ModelAndView();
		
		OpenJsonAPI api = new OpenJsonAPI(NaverNews.clientidKey, NaverNews.clientIdValue, NaverNews.clientSecretKey, NaverNews.clientSecretValue);
		String query = req.getParameter("query");
		if(null == query || query.isEmpty()) {
			System.out.println("검색어를 입력해주세요.");
			
		}else {
			String params1 = "display=10&start=1&sort=sim&query=" + query; 
			String params2 = "display=10&start=1&sort=sim&filter=medium&query=" + query;
			NaverNews<NewsData> news = api.get(NaverNews.newsUrl, params1, new TypeReference<NaverNews<NewsData>>(){});
			NaverNews<NewsImage> temp = api.get(NaverNews.imageUrl, params2, new TypeReference<NaverNews<NewsImage>>(){});
			NaverNews.copyImage(news.getItems(), temp.getItems());
			
			mav.addObject("first_news", news.getItems());
			mav.setViewName("home");			
		}
		
		return mav;
	}
	

}
