package neurotoxin.dayonetest.service;

import lombok.RequiredArgsConstructor;
import neurotoxin.dayonetest.controller.request.SaveExamScoreRequest;
import neurotoxin.dayonetest.controller.response.SaveExamScoreResponse;
import neurotoxin.dayonetest.model.StudentScore;
import neurotoxin.dayonetest.repository.StudentFailRepository;
import neurotoxin.dayonetest.repository.StudentPassRepository;
import neurotoxin.dayonetest.repository.StudentScoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class StudentScoreService {

    private final StudentScoreRepository studentScoreRepository;
    private final StudentPassRepository studentPassRepository;
    private final StudentFailRepository studentFailRepository;

    @Transactional
    public SaveExamScoreResponse saveScore(SaveExamScoreRequest request) {
        StudentScore studentScore = request.toEntity();
        StudentScore savedStudentScore = studentScoreRepository.save(studentScore);
        if (savedStudentScore.isPass()) {
            studentPassRepository.save(savedStudentScore.toPassEntity());
        } else {
            studentFailRepository.save(savedStudentScore.toFailEntity());
        }
        return savedStudentScore.toResponse();
    }

    public
}
