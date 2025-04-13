package smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getHomePage() {
        return "index";  // This will return homeindex.jsp
    }
    
    @RequestMapping(value = "/json", method = RequestMethod.GET)
    @ResponseBody
    public String getJSONString() {
        return "index_String";  // This will return index_String Json Response
    }
    
    @RequestMapping(value = "/about", method= RequestMethod.GET)
    public String getAboutJsp() {
    	return "about";   // This will return about.jsp
    }
}
