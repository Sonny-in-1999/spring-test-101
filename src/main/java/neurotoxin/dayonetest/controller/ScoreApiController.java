package neurotoxin.dayonetest.controller;

import neurotoxin.dayonetest.controller.request.SaveExamScoreRequest;
import neurotoxin.dayonetest.controller.response.ExamFailStudentResponse;
import neurotoxin.dayonetest.controller.response.ExamPassStudentResponse;
import neurotoxin.dayonetest.controller.response.SaveExamScoreResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScoreApiController {

    @PostMapping("/exam/score")
    public ResponseEntity<SaveExamScoreResponse> save(@RequestBody SaveExamScoreRequest request) {
        SaveExamScoreResponse response = new SaveExamScoreResponse(request.getStudentName(), request.getExam(), request.getKorScore(), request.getEnglishScore(), request.getMathScore());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/exam/pass")
    public ResponseEntity<List<ExamPassStudentResponse>> pass() {
        List<ExamPassStudentResponse> responses = List.of(
                new ExamPassStudentResponse("철수", 60.0),
                new ExamPassStudentResponse("길동", 75.0)
        );
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/exam/fail")
    public ResponseEntity<List<ExamFailStudentResponse>> fail() {
        List<ExamFailStudentResponse> responses = List.of(
                new ExamFailStudentResponse("영희", 48.0),
                new ExamFailStudentResponse("준석", 55.0)
        );
        return ResponseEntity.ok(responses);
    }

}
