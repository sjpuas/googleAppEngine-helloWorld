package cl.puas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sjpuas on 14-11-13.
 */
@Controller
public class ApiController {

    @RequestMapping(value = "user/getName", method = RequestMethod.GET)
    public String getName(@RequestParam(value = "format", required = false, defaultValue = "json") String format, Model model) {
        model.addAttribute("name", "sergio");
        model.addAttribute("year", 1989);
        switch (format) {
            default:
                return "jsonView";
        }
    }


}
