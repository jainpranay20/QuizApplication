package com.pranay.quiz.QuizService.controllers;

import com.pranay.quiz.QuizService.entities.Quiz;
import com.pranay.quiz.QuizService.services.QuizService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/quiz")
public class quizController {

    private static final Logger logger = LoggerFactory.getLogger(quizController.class);

    // create
    private QuizService quizService;

    public quizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        logger.info("Received quiz: {}", quiz);
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> get(){
       return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }
}
