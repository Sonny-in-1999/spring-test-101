package neurotoxin.dayonetest.repository;

import neurotoxin.dayonetest.model.StudentPass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentPassRepository extends JpaRepository<StudentPass, Long> {
}
