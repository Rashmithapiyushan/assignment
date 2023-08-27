package lk.ijse.dep10.assignmentpractice2.repository;

import lk.ijse.dep10.assignmentpractice2.entity.UserLoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLoginDetails,Long> {
}
