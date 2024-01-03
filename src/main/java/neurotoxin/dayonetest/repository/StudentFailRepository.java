package neurotoxin.dayonetest.repository;

import neurotoxin.dayonetest.model.StudentFail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentFailRepository extends JpaRepository<StudentFail, Long> {
}
