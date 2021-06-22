package zwiftj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class LoginController {

    @ExceptionHandler(Exception.class)
    public void handleException(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        req.setAttribute("originalUri", req.getRequestURI());
        req.getRequestDispatcher("/error").forward(req, resp);
    }

    @GetMapping(value = "/signup")
    public String signupGet(Model model) {
        model.addAttribute("message", "this is a message");
        return "signup";
    }

    @PostMapping(value = "/signup")
    public String signupPost(@RequestParam Map<String, String> allRequestParams) {
        return "login";
    }

    @GetMapping(value = "/login")
    public String loginGet(Model model) {
        return "login";
    }

    @PostMapping(value = "/login")
    public String loginPost(Model model, @RequestParam Map<String, String> allRequestParams) {
        String userName = allRequestParams.get("username");
        model.addAttribute("username", userName);
        return "user_home";
    }
}
