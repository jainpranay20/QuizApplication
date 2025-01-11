package com.pranay.quiz.QuizService.repository;

import com.pranay.quiz.QuizService.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
