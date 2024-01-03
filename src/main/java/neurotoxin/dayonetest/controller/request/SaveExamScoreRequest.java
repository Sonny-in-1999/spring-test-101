package neurotoxin.dayonetest.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import neurotoxin.dayonetest.model.StudentScore;

@Getter
@AllArgsConstructor
public class SaveExamScoreRequest {
    private final String studentName;
    private final String exam;
    private final Integer korScore;
    private final Integer englishScore;
    private final Integer mathScore;

    public StudentScore toEntity() {
        return StudentScore.builder()
                .studentName(studentName)
                .exam(exam)
                .korScore(korScore)
                .englishScore(englishScore)
                .mathScore(mathScore)
                .build();
    }
}
