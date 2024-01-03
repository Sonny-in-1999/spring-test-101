package neurotoxin.dayonetest.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class SaveExamScoreResponse {
    private final String studentName;
    private final String exam;
    private final Integer korScore;
    private final Integer englishScore;
    private final Integer mathScore;
}
