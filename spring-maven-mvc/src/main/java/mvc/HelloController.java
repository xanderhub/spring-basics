package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/showForm")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping(value = "/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping(value = "/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Yo! " + theName;

        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping(value = "/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam(name = "studentName") String name,
            Model model) {

        name = name.toUpperCase();

        String result = "This is version 3! " + name;

        model.addAttribute("message", result);

        return "helloworld";
    }
}
