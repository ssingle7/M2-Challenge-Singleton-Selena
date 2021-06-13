package com.cognizant.magicapi.controller;

import com.cognizant.magicapi.model.Answer;
import com.cognizant.magicapi.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private static int idCounter = 1;

    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote( idCounter++, "Dulce Ruby", "Just like the moon, we go through phases."),
            new Quote( idCounter++, "Imam al-Shafi'i", "Lions don't lose sleep over the opinion of sheep."),
            new Quote( idCounter++, "Mom", "I hope you're catching on quickly!"),
            new Quote( idCounter++, "Son", "Do your very best Mom!"),
            new Quote( idCounter++, "Bestie", "Don't give up now!"),
            new Quote( idCounter++, "Classmate", "We're all stressed!"),
            new Quote( idCounter++, "Instructor", "Copy Pasta!"),
            new Quote( idCounter++, "Student Success Manager", "Schedule some time with me!"),
            new Quote( idCounter++, "TA", "Slack me!"),
            new Quote( idCounter++, "Recruiter", "Check your email!")));




    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public Quote getRandomQuote() {

        Random rand = new Random();
        int randomNum = rand.nextInt(quoteList.size());
        Quote randomQuote = quoteList.get(randomNum);
        return randomQuote;
    }

}
