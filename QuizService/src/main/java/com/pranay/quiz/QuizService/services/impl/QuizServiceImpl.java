package com.pranay.quiz.QuizService.services.impl;

import com.pranay.quiz.QuizService.entities.Quiz;
import com.pranay.quiz.QuizService.repository.QuizRepository;
import com.pranay.quiz.QuizService.services.QuizService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    private static final Logger logger = LoggerFactory.getLogger(QuizServiceImpl.class);

    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        logger.info("vlaue of quiz is", quiz);
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz not found"));
    }
}
