package com.cognizant.magicapi.controller;

import com.cognizant.magicapi.model.Quote;
import com.cognizant.magicapi.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {

    private static int idCounter = 1;

    private static List<Word> wordList = new ArrayList<>(Arrays.asList(
            new Word( idCounter++, "Algorithm", "A list of rules to follow in order to solve them."),
            new Word( idCounter++, "Computer Program", "A group of instructions given to a computer to be processed in a specific programming language."),
            new Word( idCounter++, "Bug", "An error that prevents a website or app from running as it should."),
            new Word( idCounter++, "Version Control", "Recording and managing the changes you make while coding."),
            new Word( idCounter++, "Text Editor", "A type of software used to write plain text."),
            new Word( idCounter++, "HTML", "A standard markup language used to create the structure of a webpage."),
            new Word( idCounter++, "CSS", "A styling language use to style HTML documents."),
            new Word( idCounter++, "Javascript", "A scripting language that can change CSS and HTML elements on a website."),
            new Word( idCounter++, "GIT", "An open source distributed version control system."),
            new Word( idCounter++, "SCRUM", "A framework that helps teams work together.")));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public Word getRandomWord() {

        Random rand = new Random();
        int randomNum = rand.nextInt(wordList.size());
        Word getRandomWord = wordList.get(randomNum);
        return getRandomWord;
    }



}
