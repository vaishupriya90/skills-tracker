package org.launchcode.skillstracker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping(value="")
    @ResponseBody
    public String availableSkills(){
        return "<html>" +
                "<body>" +
                "<h1>SKills Tracker</h1>" +
                "<h2>We have few skills you might be interested. Here is the the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Java Script</li>" +
                "<li>C#</li>" +
                "<a href='/form'>Click this to get the form</a>" +
                "</body>" +
                "</html>";
    }

    @PostMapping()
    @ResponseBody
    public String userResponse(@RequestParam String userName,@RequestParam String favoriteLanguage,@RequestParam String favoriteLanguage2,@RequestParam String favoriteLanguage3){
        return "<h2>"+ userName+"</h2>" +
                "<table style='border:1px solid black' style='width:100%'>" +
                "<th>Preference</th>" +
                "<th> Language</th>" +
                "<tr>" +
                "<td>First choice</td>" +
                "<td>"+favoriteLanguage+"</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Second choice</td>" +
                "<td>"+favoriteLanguage2+"</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Third Choice</td>" +
                "<td>"+favoriteLanguage3+"<td>" +
                "<tr>" +
                "<table>";


    }
    @GetMapping("form")
    @ResponseBody
    public String skillSelectionForm(){
        return "<form method='post' action='/'>" +
                "<label>Name:</label> </br>" +
                "<input type='text' name='userName'>" +
                "</br>" +
                "<label>My favorite language is:</label>" +
                "</br>" +
                "<select name='favoriteLanguage'>" +
                "<option value='javaScript'>Java Script</option>" +
                "<option value='c#'>C#</option>" +
                "<option value='java'>Java</option>" +
                "</select>" +
                "</br>" +
                "<label>My Second favorite language is:</label>" +
                "</br>" +
                "<select name='favoriteLanguage2'>" +
                "<option value='javaScript'>Java Script</option>"+
                "<option value='c#'>C#</option>" +
                "<option value='java'>Java</option>" +
                "</select>" +
                "</br>" +
                "<label>My Third favorite language is:</label>" +
                "</br>" +
                "<select name='favoriteLanguage3'>" +
                "<option value='javaScript'>Java Script</option>" +
                "<option value='c#'>C#</option>" +
                "<option value='java'>Java</option>" +
                "</select>" +
                "</br>" +
                "<input type='submit' value='submit'>" +
                "</form>";



    }

}
