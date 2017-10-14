package cop.empl.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestAppController
{
    @GetMapping(value="/employee-manager")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}