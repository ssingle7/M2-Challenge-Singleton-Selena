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
            new Word( idCounter++, "R", "R!"),
            new Word( idCounter++, "G", "G!"),
            new Word( idCounter++, "S", "s!"),
            new Word( idCounter++, "M", "m!"),
            new Word( idCounter++, "O", "o!"),
            new Word( idCounter++, "f", "F!"),
            new Word( idCounter++, "L", "l!"),
            new Word( idCounter++, "E", "e!"),
            new Word( idCounter++, "A", "a!"),
            new Word( idCounter++, "B", "b!")));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public Word getRandomWord() {

        Random rand = new Random();
        int randomNum = rand.nextInt(wordList.size());
        Word getRandomWord = wordList.get(randomNum);
        return getRandomWord;
    }



}
