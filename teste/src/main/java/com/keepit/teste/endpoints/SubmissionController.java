package com.keepit.teste.endpoints;

import com.keepit.teste.entity.Submission;
import com.keepit.teste.entity.User;
import com.keepit.teste.service.impls.SubmissionServiceImpl;
import com.keepit.teste.service.impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/submissions")
public class SubmissionController {

    @Autowired
    private SubmissionServiceImpl submissionService;


    @PostMapping
    public Submission save(@Valid @RequestBody Submission submission){
        return submissionService.save(submission);
    }

    @GetMapping("{userId}")
    public List<Submission> findByUser(@PathVariable("userId") Long userId) {
        return submissionService.findByUserId(userId);
    }


}
