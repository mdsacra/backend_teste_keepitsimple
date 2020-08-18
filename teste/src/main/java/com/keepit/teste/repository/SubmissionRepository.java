package com.keepit.teste.repository;

import com.keepit.teste.entity.Submission;
import com.keepit.teste.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {

    List<Submission> findByUserId(Long UserId);
}
