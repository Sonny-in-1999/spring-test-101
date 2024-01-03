package neurotoxin.dayonetest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import neurotoxin.dayonetest.controller.response.SaveExamScoreResponse;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_score_id")
    private Long id;

    private String exam;

    private String studentName;

    private Integer korScore;
    private Integer englishScore;
    private Integer mathScore;

    public SaveExamScoreResponse toResponse() {
        return SaveExamScoreResponse.builder()
                .exam(exam)
                .studentName(studentName)
                .korScore(korScore)
                .englishScore(englishScore)
                .mathScore(mathScore)
                .build();
    }

    public StudentPass toPassEntity() {
        Double avgScore = (korScore + englishScore + mathScore) / 3.0;
        return StudentPass.builder()
                .exam(exam)
                .studentName(studentName)
                .avgScore(avgScore)
                .build();
    }

    public StudentFail toFailEntity() {
        Double avgScore = (korScore + englishScore + mathScore) / 3.0;
        return StudentFail.builder()
                .exam(exam)
                .studentName(studentName)
                .avgScore(avgScore)
                .build();
    }

    public Boolean isPass() {
        return (korScore + englishScore + mathScore) / 3 >= 60;
    }

}
