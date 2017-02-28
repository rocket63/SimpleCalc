package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("addingCalc","","");

    }

    @RequestMapping("welcome")

    public ModelAndView helloWorld2()
    {
        return new
                ModelAndView("welcome2","message","Hello World2");

    }
    @RequestMapping("processForm")
    public ModelAndView processFormMethod(@RequestParam("FNum") int fNum,
                                          @RequestParam("SNum") int sNum)

    {   int sum = fNum + sNum;
        return new ModelAndView("addingCalc", "confMessage", sum);

    }

}
