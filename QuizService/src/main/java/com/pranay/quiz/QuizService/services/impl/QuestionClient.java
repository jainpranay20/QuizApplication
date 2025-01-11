package com.pranay.quiz.QuizService.services.impl;

import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url="http://localhost:8082", value="Question-Client")
public interface QuestionClient {

}
