package neurotoxin.dayonetest.repository;

import neurotoxin.dayonetest.model.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentScoreRepository extends JpaRepository<StudentScore, Long> {
}
