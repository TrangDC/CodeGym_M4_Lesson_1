package com.example.calculator_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @PostMapping("/converter")
    public ModelAndView convert(@RequestParam("usd") double usdAmount,
                                @RequestParam("rate") double exchangeRate) {
        double vndAmount = usdAmount * exchangeRate;

        ModelAndView modelAndView = new ModelAndView("result.jsp");
        modelAndView.addObject("usdAmount", usdAmount);
        modelAndView.addObject("exchangeRate", exchangeRate);
        modelAndView.addObject("vndAmount", vndAmount);

        return modelAndView;
    }
}
