package com.pranay.question.QuestionService.controllers;

import com.pranay.question.QuestionService.entities.Question;
import com.pranay.question.QuestionService.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id){
        return questionService.getOne(id);
    }

    // get all question of specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionOfQuiz(quizId);
    }
}
