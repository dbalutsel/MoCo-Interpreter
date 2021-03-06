package md.balutsel.mocointerpreter.backend.repository;

import md.balutsel.mocointerpreter.backend.model.CourseInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {
    @Query("SELECT c " +
            "FROM CourseInstance c " +
            "WHERE c.name = :courseName " +
            "AND c.username = :username")
    CourseInstance findByCourseNameAndUsername(@Param("courseName") String courseName, @Param("username") String username);
}
