package skypro_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/skypro")
public class SpringMVCController {
    @RequestMapping("/1")
    public String getFirstView(){
        return "view1";
    }
    @RequestMapping("/enterInfo")
    public String enterInfo(){
        return "enterInfo";
    }
    @RequestMapping("/showInfo")
    public String showInfo(HttpServletRequest request, Model model){
        String showCountry = request.getParameter("country");
        String showCapital = request.getParameter("capital");
        model.addAttribute("country", showCountry);
        model.addAttribute("capital", showCapital);
        return "showInfo";
    }

}
