package me.thaveesha.Department.Service.repository;

import me.thaveesha.Department.Service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


    Department findByDepartmentId(Long departmentId);
}
