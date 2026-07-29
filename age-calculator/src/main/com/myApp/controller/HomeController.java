package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.Period;

@Controller
public class HomeController {

    @RequestMapping({"/", "/home"})
    public String showHomePage() {
        return "home";
    }

    @RequestMapping("/calculate-age")
    public String calculateAge(
            @RequestParam("year") int year,
            @RequestParam("month") int month,
            @RequestParam("day") int day,
            Model model) {

        try {
            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate today = LocalDate.now();

            if (birthDate.isAfter(today)) {
                model.addAttribute(
                        "error",
                        "Birth date cannot be in the future."
                );

                return "home";
            }

            Period age = Period.between(birthDate, today);

            String result =
                    "Your age is: "
                            + age.getYears() + " years, "
                            + age.getMonths() + " months, "
                            + age.getDays() + " days";

            model.addAttribute("result", result);

        } catch (Exception e) {
            model.addAttribute(
                    "error",
                    "Please enter a valid date."
            );
        }

        return "home";
    }
}
