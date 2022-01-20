package me.thaveesha.Department.Service.controller;

import lombok.extern.slf4j.Slf4j;
import me.thaveesha.Department.Service.entity.Department;
import me.thaveesha.Department.Service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
      //  log.info("Test");
        return departmentService.saveDepartment(department);
    }
   @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable ("id") Long departmentId){
        return departmentService.findDepartmentById(departmentId);
    }


}
