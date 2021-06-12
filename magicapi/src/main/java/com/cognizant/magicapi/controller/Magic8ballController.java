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
            "IDK",
            "You've got to be kidding me!",
            "Absolutely!"
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


//    //for example
//    public static void main(String[] args) {
//
//
//
//        List<ChocoalteFactory> studentsAtOfficeHours = new ArrayList<>(
//                Arrays.asList(
//                        new ChocolateFactory("Wonka", 1922, "Wonka Bar"),
//                        new ChocolateFactory("Hershey", 1903, "Hershey Bar"),
//                        "Ashlyn",
//                        "Selena",
//                        "Dennis",
//                        "Janella"
//                )
//        );
//
//        for (int i = 0; i < 100; i++) {
////        int randonNum =ran.nextInt(1000)+1;
//            int randomStudentIndex = rand.nextInt(studentsAtOfficeHours.size());
//            ChocoalteFactory(instead of a String) student = studentsAtOfficeHours.get(randomStudentIndex);
//
////        String student = studentsAtOfficeHours.get(randomNumber % studentsAtOfficeHours.size());
//            System.out.println("Here's a random student!" + student);
//        }
//    }
}
