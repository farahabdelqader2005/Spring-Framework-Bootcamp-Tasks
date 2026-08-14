package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showFormMethod()
    {
        return "home";
    }

    @RequestMapping("/processForm")
    public String processFormMethod(HttpServletRequest request, Model model)
    {
        String year = request.getParameter("yearParam");
        String month = request.getParameter("monthParam");
        String day = request.getParameter("dayParam");

        int userAge = calculateAge(
                Integer.parseInt(year),
                Integer.parseInt(month),
                Integer.parseInt(day)
        );

        model.addAttribute("age", userAge);

        return "result";
    }

    private int calculateAge(int year, int month, int day)
    {
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();

        return now.getYear() - dateOfBirth.getYear();
    }
}