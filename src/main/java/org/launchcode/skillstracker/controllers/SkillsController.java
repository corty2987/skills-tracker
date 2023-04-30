package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String home() {
        return "<h1 style='color: green'>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String form() {
        return "<form method='POST'>" +
                "<label for='name'>Name: </label>" +
                    "<input name='name'>" +
                "<br>" +
                "<label for='firstFavorite'>My Favorite Language: </label>" +
                    "<select name='firstFavorite'>" +
                        "<option></option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                "<br>" +
                "<label for='secondFavorite'>My Second Favorite Language: </label>" +
                    "<select name='secondFavorite'>" +
                        "<option></option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                "<br>" +
                "<label for='thirdFavorite'>My Third Favorite Language: </label>" +
                    "<select name='thirdFavorite'>" +
                        "<option></option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>";

    }
    //takes post data and displays information
    @PostMapping("/form")
    @ResponseBody
    public String formResponse(@RequestParam String name, @RequestParam String firstFavorite, @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstFavorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>";
    }

}
