package com.keepit.teste.service.impls;

import com.keepit.teste.entity.Submission;
import com.keepit.teste.entity.User;
import com.keepit.teste.repository.SubmissionRepository;
import com.keepit.teste.repository.UserRepository;
import com.keepit.teste.service.interfaces.SubmissionServiceInterface;
import com.keepit.teste.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubmissionServiceImpl implements SubmissionServiceInterface {

    @Autowired
    private SubmissionRepository submissionRepository;

    @Override
    public Submission save(Submission submission) {
        return submissionRepository.save(submission);
    }

    @Override
    public List<Submission> findByUserId(Long userId) {
        return submissionRepository.findByUserId(userId);
    }
}
