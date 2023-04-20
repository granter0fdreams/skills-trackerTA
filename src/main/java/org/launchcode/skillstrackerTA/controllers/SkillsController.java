package org.launchcode.skillstrackerTA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping(value="")
    @ResponseBody
    public String initialSkills(){
        String html = "<h1>Skills Tracker</h1>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
        return html;
    }

    @GetMapping(value="form")
    @ResponseBody
    public String formSkills(){
        String html = "<form method='post'>" +
                "Name:<br>" +
                "<input type='text' name='name' />" +
                "<br>My Favorite Language:<br>" +
                "<select name='firstChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>My Second Favorite Language:<br>" +
                "<select name='secondChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>My Third Favorite Language:<br>" +
                "<select name='thirdChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>";
        return html;
    }

    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){

    }
}
