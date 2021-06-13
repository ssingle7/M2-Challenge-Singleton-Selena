package com.cognizant.magicapi.controller;

import com.cognizant.magicapi.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class Magic8ballController {

    private static int idCounter = 1;

    private static List<String> answerList = new ArrayList<>(Arrays.asList(
            "Yes",
            "No",
            "Maybe",
            "I'm not sure. Ask again tomorrow",
            "I think you already know the answer to that",
            "Don't second guess yourself"
    ));

    @RequestMapping(value = "/magic8", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer recreateAnswer(@RequestBody @Valid String question) {

        Random rand = new Random();
        int randomNum = rand.nextInt(answerList.size());
        String randomAnswer = answerList.get(randomNum);
        Answer answerToQuestion = new Answer(randomAnswer,0, question);

        return answerToQuestion;
    }
}
