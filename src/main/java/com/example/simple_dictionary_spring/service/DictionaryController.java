package com.example.simple_dictionary_spring.service;

import com.example.simple_dictionary_spring.service.DictionaryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

//    private DictionaryImpl dictionary;
//
//    public DictionaryController() {
//        this.dictionary = new DictionaryImpl();
//    }
    @Autowired
    private DictionaryImpl dictionary;

    @GetMapping("/dictionary")
    public String showForm() {
        return "search";
    };

    @PostMapping("/dictionary")
    public ModelAndView findWord(@RequestParam ("engword") String engword) {
       String vnword = dictionary.findVietnameseWord(engword);
       String error = "";
       ModelAndView result = new ModelAndView("dictionary");
       if (vnword != null) {
          result.addObject("eng", engword);
          result.addObject("vn", vnword);
           result.addObject("error", error);
          return result;
       } else {
           error = "Không tìm thấy";
           result.addObject("error", error);
           return result;
       }
    }

}
