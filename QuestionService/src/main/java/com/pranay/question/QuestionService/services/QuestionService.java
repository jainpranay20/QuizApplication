package com.pranay.question.QuestionService.services;

import com.pranay.question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);
}
