package com.shorturl.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shorturl.app.Model.OriginalURL;
import com.shorturl.app.Model.ShortURLC;
import com.shorturl.app.Repository.OriginalURLRepository;
import com.shorturl.app.Repository.ShortURLRepository;

@Controller
public class URLController {
 
	@Autowired
	OriginalURL oURL;
	
	@Autowired
	ShortURLC sURL;
	
	@Autowired
	OriginalURLRepository oURLRepo;
	
	@Autowired
	ShortURLRepository sURLRepo;
	
	@RequestMapping("/")
	public String  homePage() {
		
		
		return "index";
	}
	
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
    public String acceptURL(@RequestParam("original_url")String original_url,
    		@RequestParam("short_url")String short_url,Model model) {
    	 
        ShortURLC su=sURLRepo.findByUrlAlias(short_url);
		
		if(su==null) {
    	oURL.setOriginal_url(original_url);
    	sURL.setUrlAlias(short_url);
    	
    	
    	oURL.setShorturl(sURL);
    	sURL.setOriginalURL(oURL);
    	oURLRepo.save(oURL);
    	
    	model.addAttribute("alert", "alert('Your URL was successfully created :) ')");
    	return "index";
		}
		
		
		model.addAttribute("error", "Already Taken By Some One Try diffrent One :( ");
		return "index";
    	
    }
	
	@RequestMapping("/{urlalias}")
	public String redirectToUrl(@PathVariable("urlalias")String urlalias) {
		
		ShortURLC su=sURLRepo.findByUrlAlias(urlalias);
		
		if(su!=null) {
			
		
		String red=su.getOriginalURL().getOriginal_url();
		
		System.out.println(" original URL "+red);
		return "redirect:"+red;
		}	
		
		return "index";
	}
}
