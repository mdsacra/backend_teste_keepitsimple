package com.keepit.teste.service.interfaces;

import com.keepit.teste.entity.Submission;
import com.keepit.teste.entity.User;

import java.util.List;
import java.util.Optional;

public interface SubmissionServiceInterface {

    Submission save(Submission submission);

    List<Submission> findByUserId(Long userId);

}
